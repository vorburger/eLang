package ch.vorburger.elang.engine.ast;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import ch.vorburger.elang.eLangDsl.Expression;
import ch.vorburger.elang.eLangDsl.IF;
import ch.vorburger.elang.eLangDsl.LiteralBOOLEAN_FALSE;
import ch.vorburger.elang.eLangDsl.LiteralBOOLEAN_TRUE;
import ch.vorburger.elang.eLangDsl.LiteralNULL;
import ch.vorburger.elang.eLangDsl.MultiplyOrDivideExpression;
import ch.vorburger.elang.eLangDsl.ObjectNavigation;
import ch.vorburger.elang.eLangDsl.UnaryPlusMinusExpression;
import ch.vorburger.elang.eLangDsl.Variable;
import ch.vorburger.elang.eLangDsl.VariableOrSquareBracketFunction;
import ch.vorburger.elang.engine.data.Location;


/**
 * Generate our AST (see other classes in this package) from the xText EMF
 * AST. This is the Node Factory.
 * 
 * @author Michael Vorburger
 */
public class ASTTranslator {
	
	// TODO Is there any noticeable run-time difference if disabled?
	private static final boolean MY_ASSERT_ENABLED = true;
	
	private static EStructuralFeature sfNumber;
	private static EStructuralFeature sfDate;
	private static EStructuralFeature sfDateTime;
	private static EStructuralFeature sfString;
	private static EStructuralFeature sfAdditionOrSubtractionExpressionValues;
	private static EStructuralFeature sfAdditionOrSubtractionExpressionOperators;
//	private static EStructuralFeature sfMultiplyOrDivideExpressionValues;
//	private static EStructuralFeature sfMultiplyOrDivideExpressionOperators;
//	private static EStructuralFeature sfNegatedExpression;
	private static EStructuralFeature sfRelationalORExpressionValues;
	private static EStructuralFeature sfRelationalANDExpressionValues;
	private static EStructuralFeature sfRelationalComparisonExpressionLValue;
	private static EStructuralFeature sfRelationalComparisonExpressionOperator;
	private static EStructuralFeature sfRelationalComparisonExpressionRValue;
	private static EStructuralFeature sfRelationalNOTExpressionValue;
	// private static EStructuralFeature sfVariableName;
	
	public static ScriptImpl newScript(/*Scpt*/ch.vorburger.elang.eLangDsl.Expression emfASTRootNode, String scriptText) {
		return new ScriptImpl(newScptASTNode(emfASTRootNode), scriptText);
	}

	@SuppressWarnings("unchecked") // TODO Can remove now, all checked?
	private static Node newScptASTNode(EObject astNode) {
		if (astNode == null) {
			return new EmptyScriptNode();
		}
		
		String xTextRuleName = astNode.eClass().getName(); 
		// System.out.println("emfASTRootNode.eClass().getName() = " + xTextRuleName);
		
//		if (xTextRuleName.equals("Scpt")) {
//			return new EmptyScriptNode(astNode);
//		}
//		if (astNode instanceof Scpt) {
//			Scpt scpt = (Scpt) astNode;
//			List<Expression> expressions = scpt.getExpressions();
//			if (expressions.size() == 0) {
//				return new EmptyScriptNode(astNode);
//			} else if (expressions.size() == 1) {
//				return newScptASTNode(expressions.get(0));
//			} else {
//				throw new NotImplementedException("Support for multi-expressions TBD ASAP");
//			}
//		}
		if (xTextRuleName.equals("LiteralNUMBER")) {
			if (sfNumber == null) {
				sfNumber = getSingleEStructuralFeature(astNode, "LiteralNUMBER", "number", "EString");
			}
			String numberAsString = (String) astNode.eGet(sfNumber);
			return new NumberNode(astNode, numberAsString);
			
		} else if (xTextRuleName.equals("LiteralDATE")) {
			if (sfDate == null) {
				sfDate = getSingleEStructuralFeature(astNode, "LiteralDATE", "date", "EString");
			}
			return new DateTimeNode(astNode, (String)astNode.eGet(sfDate) );

		} else if (xTextRuleName.equals("LiteralDATE_TIME")) {
			if (sfDateTime == null) {
				sfDateTime = getSingleEStructuralFeature(astNode, "LiteralDATE_TIME", "dateTime", "EString");
			}
			return new DateTimeNode(astNode, (String)astNode.eGet(sfDateTime) );

		} else if (xTextRuleName.equals("LiteralSTRING")) {
			if (sfString == null) {
				sfString = getSingleEStructuralFeature(astNode, "LiteralSTRING", "text", "EString");
			}
			return new StringNode(astNode, (String)astNode.eGet(sfString) );

//		} else if (xTextRuleName.equals("NegatedExpression")) {
//			if (sfNegatedExpression == null) {
//				sfNegatedExpression = getSingleEStructuralFeature(astNode, "NegatedExpression", "number", "Expression");
//			}
//			return new NegationNode(astNode, newScptASTNode((EObject)astNode.eGet(sfNegatedExpression)) );

		} else if (xTextRuleName.equals("RelationalNOTExpression")) {
			if (sfRelationalNOTExpressionValue == null) {
				sfRelationalNOTExpressionValue = getEStructuralFeature(astNode, "RelationalNOTExpression", "abool", "Expression");
			}
			return new RelationalNOTExpressionNode(astNode, newScptASTNode((EObject)astNode.eGet(sfRelationalNOTExpressionValue)) );

		} else if (xTextRuleName.equals("AdditionOrSubtractionExpression")) {
			if (sfAdditionOrSubtractionExpressionValues == null) {
				sfAdditionOrSubtractionExpressionValues = getEStructuralFeature(astNode, "AdditionOrSubtractionExpression", "values", "MultiplyOrDivideExpression");
				sfAdditionOrSubtractionExpressionOperators = getEStructuralFeature(astNode, "AdditionOrSubtractionExpression", "operators", "EString");
			}
			EList<EObject> emfValues = (EList<EObject>) astNode.eGet(sfAdditionOrSubtractionExpressionValues);
			if (emfValues.size() == 1) {
				return newScptASTNode(emfValues.get(0));
			} else {
				return new AdditionSubtractionMultiplyingDividingExpressionNode(astNode,
						makeListOfMyASTNodeValues(emfValues), 
						makeListOfMyASTOperators(astNode, sfAdditionOrSubtractionExpressionOperators));
			}
			
		} else if (xTextRuleName.equals("MultiplyOrDivideExpression")) {
//			if (sfMultiplyOrDivideExpressionValues == null) {
//				sfMultiplyOrDivideExpressionValues = getEStructuralFeature(emfASTNode, "MultiplyOrDivideExpression", "values", "Term");
//				sfMultiplyOrDivideExpressionOperators = getEStructuralFeature(emfASTNode, "MultiplyOrDivideExpression", "operators", "EString");
//			}
//			EList<EObject> emfValues = (EList<EObject>) emfASTNode.eGet(sfMultiplyOrDivideExpressionValues);
//			if (emfValues.size() == 1) {
//				return newScptASTNode(emfValues.get(0));
//			} else {
//				return new AdditionSubtractionMultiplyingDividingExpressionNode(emfASTNode,
//						makeListOfMyASTNodeValues(emfValues), 
//						makeListOfMyASTOperators(emfASTNode, sfMultiplyOrDivideExpressionOperators));
//			}
			MultiplyOrDivideExpression multiplyDivide = (MultiplyOrDivideExpression) astNode;
			List<UnaryPlusMinusExpression> values = multiplyDivide.getValues();
			if (values.size() == 1) {
				return newScptASTNode(values.get(0));
			} else {
				return new AdditionSubtractionMultiplyingDividingExpressionNode(astNode,
						makeListOfMyASTNodeValues(values), multiplyDivide.getOperators());
			}

		} else if (xTextRuleName.equals("RelationalComparisonExpression")) {
			if (sfRelationalComparisonExpressionLValue == null) {
				sfRelationalComparisonExpressionLValue = getEStructuralFeature(astNode, "RelationalComparisonExpression", "lvalue", "AdditionOrSubtractionExpression");
				sfRelationalComparisonExpressionOperator = getEStructuralFeature(astNode, "RelationalComparisonExpression", "operator", "EString");
				sfRelationalComparisonExpressionRValue = getEStructuralFeature(astNode, "RelationalComparisonExpression", "rvalue", "AdditionOrSubtractionExpression");
			}
			EObject emfLValue = (EObject) astNode.eGet(sfRelationalComparisonExpressionLValue);
			String operator = (String) astNode.eGet(sfRelationalComparisonExpressionOperator);
			
			if (operator == null) {
				return newScptASTNode(emfLValue);
			} else {
				EObject emfRValue = (EObject) astNode.eGet(sfRelationalComparisonExpressionRValue);
				return new RelationalComparisonExpressionNode(astNode, newScptASTNode(emfLValue), operator, newScptASTNode(emfRValue));
			}
			
		} else if (xTextRuleName.equals("RelationalORExpression")) {
			if (sfRelationalORExpressionValues == null) {
				sfRelationalORExpressionValues = getEStructuralFeature(astNode, "RelationalORExpression", "values", "RelationalANDExpression");
			}
			EList<EObject> emfValues = (EList<EObject>) astNode.eGet(sfRelationalORExpressionValues);
			if (emfValues.size() == 1) {
				return newScptASTNode(emfValues.get(0));
			} else {
				return new RelationalORExpressionNode(astNode, 
					makeListOfMyASTNodeValues(emfValues)); 
			}
			
		} else if (xTextRuleName.equals("RelationalANDExpression")) {
			if (sfRelationalANDExpressionValues == null) {
				sfRelationalANDExpressionValues = getEStructuralFeature(astNode, "RelationalANDExpression", "values", "RelationalComparisonExpression");
			}
			EList<EObject> emfValues = (EList<EObject>) astNode.eGet(sfRelationalANDExpressionValues);
			if (emfValues.size() == 1) {
				return newScptASTNode(emfValues.get(0));
			} else {
				return new RelationalANDExpressionNode(astNode, 
					makeListOfMyASTNodeValues(emfValues)); 
			}
			
		} else if (astNode instanceof UnaryPlusMinusExpression) {
			UnaryPlusMinusExpression unaryPlusMinusExpression = (UnaryPlusMinusExpression) astNode;
			Node subNode = newScptASTNode(unaryPlusMinusExpression.getValue());
			if (unaryPlusMinusExpression.getOperator() != null 
			 && unaryPlusMinusExpression.getOperator().equals("-")) 
			{
				return new NegationNode(astNode, subNode);
			} else {
				return subNode;
			}
			
//		} else if (xTextRuleName.equals("Variable")) {
//			if (sfVariableName == null) {
//				sfVariableName = getEStructuralFeature(astNode, "Variable", "varname", "EString");
//			}
//			return new VariableNode(astNode, (String)astNode.eGet(sfVariableName) );
		} else if (astNode instanceof Variable) {
			Variable variable = (Variable) astNode;
			return new VariableNode(location(variable), variable.getVarname());
			
		} else if (astNode instanceof ObjectNavigation) {
			ObjectNavigation objectNavigation = (ObjectNavigation) astNode;
			Node root = newScptASTNode(objectNavigation.getR());
			if (objectNavigation.getVs().size() == 0) {
				return root;
			} else {
				List<VariableOrSquareBracketFunction> vars = objectNavigation.getVs();
				List<VariableNode> varNodes = new LinkedList<VariableNode>();
				for (VariableOrSquareBracketFunction variableOrSquareBracketFunction : vars) {
					if (variableOrSquareBracketFunction instanceof Variable) {
						Variable var = (Variable) variableOrSquareBracketFunction;
						varNodes.add(new VariableNode(location(var), var.getVarname()));
					} else {
						// TODO Implement SquareBracketFunctions, cannot throw exceptions here (if grammar allows this) 
						throw new RuntimeException("SquareBracketFunctions not yet implemented");
					}
				}
				
				return new ObjectNavigationNode(astNode, root, varNodes);				
			}

		} else if (astNode instanceof LiteralBOOLEAN_TRUE) {
			return BooleanNode.TRUE;
			
		} else if (astNode instanceof LiteralBOOLEAN_FALSE) {
			return BooleanNode.FALSE;

		} else if (astNode instanceof LiteralNULL) {
			return NullNode.NULL;
			
		} else if (astNode instanceof IF) {
			IF ifExp = (IF) astNode;
			Node elseNode;
			if (ifExp.getElse() != null) {
				elseNode = newScptASTNode(ifExp.getElse());
			} else {
				// If there is no else expression, then set a NullNode, and NOT an EmptryScriptNode (as newScptASTNode would have done)  
				elseNode = NullNode.NULL; 
			}
			return new IfNode(location(ifExp), newScptASTNode(ifExp.getCondition()), newScptASTNode(ifExp.getThen()), elseNode); 

//		} else if (astNode instanceof MSG) {
//			MSG msg = (MSG) astNode;
//			return new MsgNode(location(msg), msg.getType(), newScptASTNode(msg.getAttribute()), newScptASTNode(msg.getMsgNature()),
//					newScptASTNode(msg.getMsgRef()), newScptASTNode(msg.getMsgText()), makeListOfPrintfVariables(msg.getVariables()));
			
		} else {
			throw new RuntimeException("Unexpected Coding Error! Unknown xText Rule Name found during transformation of xText EMF AST to eLang Script AST: " + xTextRuleName);
		}
	}

	
	// TODO When Node & Co. have been refactored not to depend on EMF anymore, make this a private non-static instead of a package-local static helper
	static Location location(EObject emfASTNode) {
		ICompositeNode node = NodeModelUtils.findActualNodeFor(emfASTNode); // TODO use findActualNodeFor() or getNode()
		return new LocationImpl(0, 0, 0, 0, null); // TODO FixMe!
//		return new LocationImpl(node.getStartLine(), node.getEndLine(), node.getOffset(), node.getOffset() + node.getL
//				NodeUtil.getRootNode(emfASTNode).getOffset(),
//				NodeUtil.getRootNode(emfASTNode).getOffset() + NodeUtil.getRootNode(emfASTNode).getLength(),
//				"" /* Token Text to (re)do... see below */);
		
		/*		
		CompositeNode xTextNode = NodeUtil.getRootNode(emfASTNode);
		this.line = xTextNode.getLine();
		this.posStart = xTextNode.getOffset(); // TODO getTotalOffset() ?
		this.posEnd = this.posStart + xTextNode.getLength(); // TODO getTotalLenght()?
		
		if (xTextNode.getElement() != null) {
			EObject element = xTextNode.getElement();
			throw new Error("TODO: Of what type is this EObject element?? " + element.getClass()); // TODO
			// TODO this.tokenText = null;
		} else {
			this.tokenText = "???"; // Shouldn't happen, superclass should have used alternative constructor..
		}
		*/		
	}

//	private static List<String> makeListOfMyASTOperators(List<String> eList) {
//		List<String> operators = new LinkedList<String>();
//		for (UnaryPlusMinusExpression astValue : eList) {
//			operators.add(astValue.getOperator());
//		}
//		return operators;
//	}
	// TODO Remove old version!
	@SuppressWarnings("unchecked")
	private static List<String> makeListOfMyASTOperators(EObject emfASTNode, EStructuralFeature sf) {
		EList<String> emfOperators = (EList<String>) emfASTNode.eGet(sf);
		List<String> myOperators = new LinkedList<String>();
		for (String myOperator : emfOperators) {
			myOperators.add(myOperator);
		}
		return myOperators;
	}

	private static List<Node> makeListOfMyASTNodeValues(List<?> astValues) {
		List<Node> values = new LinkedList<Node>();
		for (Object astValue : astValues) {
			values.add(newScptASTNode((EObject) astValue));
		}
		return values;
	}
	// TODO Remove old version!
//	private static List<Node> makeListOfMyASTNodeValues(EList<EObject> listOfEMFNodeValues) {
//		List<Node> myValues = new LinkedList<Node>();
//		for (EObject emfValue : listOfEMFNodeValues) {
//			myValues.add(newScptASTNode(emfValue));
//		}
//		return myValues;
//	}
//	private static List<VariableOrSquareBracketFunction> makeNodeListOfMyASTNodeValues(
//			EList<VariableOrSquareBracketFunction> vs) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	private static List<Node> makeListOfPrintfVariables(PRINTF_Vars variables) {
//		List<Node> list = new LinkedList<Node>();
//		// TODO list.add(newScptASTNode(variables.getArg1()));
//		return list;
//	}

	
	
	// TODO Remove EStructuralFeature helpers..
	
	private static EStructuralFeature getSingleEStructuralFeature(EObject emfASTNode, String typeName, String attributeName, String attributeExpectedTypeName) {
		myAssert("Dynamic EMF class " + typeName + " has more than one feature?! eClass().getEAllStructuralFeatures().size() = " + emfASTNode.eClass().getEAllStructuralFeatures().size(), emfASTNode.eClass().getEAllStructuralFeatures().size() == 1);
		EStructuralFeature sf = emfASTNode.eClass().getEAllStructuralFeatures().get(0);
		myAssert("Dynamic EMF class " + typeName + " has one feature, but it's not called '" + attributeName + "' ?!", sf.getName().equals(attributeName));
		myAssert("Dynamic EMF class " + typeName + " has one feature and it's called '" + attributeName + "' but it's not of type '" + attributeExpectedTypeName + "', but a '" + sf.getEType().getName() + "' ?!",  sf.getEType().getName().equals(attributeExpectedTypeName));
		return sf;
	}
	//
	// Merge these two helper methods, above and below?  I wrote above first, then needed below... leave for now; clearer.
	//
	private static EStructuralFeature getEStructuralFeature(EObject emfASTNode, String typeName, String attributeName, String attributeExpectedTypeName) {
		for (EStructuralFeature sf : emfASTNode.eClass().getEAllStructuralFeatures()) {
			if (sf.getName().equals(attributeName)) {
				myAssert("Dynamic EMF class " + typeName + " does have a feature called '" + attributeName + "' but it's not of type '" + attributeExpectedTypeName + "', but a '" + sf.getEType().getName() + "' ?!",  sf.getEType().getName().equals(attributeExpectedTypeName));
				return sf;
			}
		}
		myAssert("Dynamic EMF class " + typeName + " does not have any feature not called '" + attributeName + "' ?!", false);
		return null;
	}
	
	private static void myAssert(String failureMessage, boolean boolThatHasToBeTrue) {
		if (MY_ASSERT_ENABLED) {
			if (!boolThatHasToBeTrue) {
				throw new RuntimeException(failureMessage);
			}
		}
	}

}
