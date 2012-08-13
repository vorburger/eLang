package ch.vorburger.el.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ch.vorburger.el.services.ELGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalELParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_EINT", "RULE_STRING", "RULE_ID", "RULE_HEX", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'..'", "'null'", "'NULL'", "'false'", "'FALSE'", "'true'", "'TRUE'", "'.'", "':'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'case'", "'var'", "'val'", "'super'", "'::'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=8;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__59=59;
    public static final int RULE_INT=4;
    public static final int RULE_DECIMAL=9;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_EINT=5;
    public static final int RULE_WS=12;

    // delegates
    // delegators


        public InternalELParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalELParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalELParser.tokenNames; }
    public String getGrammarFileName() { return "../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g"; }



     	private ELGrammarAccess grammarAccess;
     	
        public InternalELParser(TokenStream input, ELGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "XExpression";	
       	}
       	
       	@Override
       	protected ELGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleXExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:67:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:68:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:69:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression75);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:76:1: ruleXExpression returns [EObject current=null] : this_XOrExpression_0= ruleXOrExpression ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XOrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:79:28: (this_XOrExpression_0= ruleXOrExpression )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:81:5: this_XOrExpression_0= ruleXOrExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_ruleXExpression131);
            this_XOrExpression_0=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:97:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:98:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:99:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression165);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression175); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:106:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XFeatureCall_0= ruleXFeatureCall | this_XLiteral_1= ruleXLiteral | this_XIfExpression_2= ruleXIfExpression | this_XParenthesizedExpression_3= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XFeatureCall_0 = null;

        EObject this_XLiteral_1 = null;

        EObject this_XIfExpression_2 = null;

        EObject this_XParenthesizedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:109:28: ( (this_XFeatureCall_0= ruleXFeatureCall | this_XLiteral_1= ruleXLiteral | this_XIfExpression_2= ruleXIfExpression | this_XParenthesizedExpression_3= ruleXParenthesizedExpression ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:110:1: (this_XFeatureCall_0= ruleXFeatureCall | this_XLiteral_1= ruleXLiteral | this_XIfExpression_2= ruleXIfExpression | this_XParenthesizedExpression_3= ruleXParenthesizedExpression )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:110:1: (this_XFeatureCall_0= ruleXFeatureCall | this_XLiteral_1= ruleXLiteral | this_XIfExpression_2= ruleXIfExpression | this_XParenthesizedExpression_3= ruleXParenthesizedExpression )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 32:
            case 55:
                {
                alt1=1;
                }
                break;
            case RULE_INT:
            case RULE_EINT:
            case RULE_STRING:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                {
                alt1=2;
                }
                break;
            case 50:
                {
                alt1=3;
                }
                break;
            case 44:
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:111:5: this_XFeatureCall_0= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression222);
                    this_XFeatureCall_0=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:121:5: this_XLiteral_1= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression249);
                    this_XLiteral_1=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:131:5: this_XIfExpression_2= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression276);
                    this_XIfExpression_2=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:141:5: this_XParenthesizedExpression_3= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression303);
                    this_XParenthesizedExpression_3=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:157:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:158:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:159:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression338);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression348); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:166:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleXOtherOperatorExpression ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:169:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleXOtherOperatorExpression ) ) )* ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:170:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleXOtherOperatorExpression ) ) )* )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:170:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleXOtherOperatorExpression ) ) )* )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:171:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleXOtherOperatorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression395);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:179:1: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleXOtherOperatorExpression ) ) )*
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    int LA2_2 = input.LA(2);

                    if ( (synpred1_InternalEL()) ) {
                        alt2=1;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA2_3 = input.LA(2);

                    if ( (synpred1_InternalEL()) ) {
                        alt2=1;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA2_4 = input.LA(2);

                    if ( (synpred1_InternalEL()) ) {
                        alt2=1;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA2_5 = input.LA(2);

                    if ( (synpred1_InternalEL()) ) {
                        alt2=1;
                    }


                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:179:2: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_3_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:179:2: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:179:3: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:184:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:184:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:184:7: ()
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:185:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:190:2: ( ( ruleOpCompare ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:191:1: ( ruleOpCompare )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:191:1: ( ruleOpCompare )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:192:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression448);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:205:4: ( (lv_rightOperand_3_0= ruleXOtherOperatorExpression ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:206:1: (lv_rightOperand_3_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:206:1: (lv_rightOperand_3_0= ruleXOtherOperatorExpression )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:207:3: lv_rightOperand_3_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression471);
            	    lv_rightOperand_3_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:231:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:232:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:233:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression509);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression519); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:240:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:243:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:244:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:244:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:245:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression566);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:253:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    int LA3_2 = input.LA(2);

                    if ( (synpred2_InternalEL()) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:253:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:253:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:253:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:258:6: ( () ( ( ruleOpOther ) ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:258:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:258:7: ()
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:259:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:264:2: ( ( ruleOpOther ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:265:1: ( ruleOpOther )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:265:1: ( ruleOpOther )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:266:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression619);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:279:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:280:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:280:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:281:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression642);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:305:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:306:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:307:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther681);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther692); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:314:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '..' ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:317:28: (kw= '..' )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:319:2: kw= '..'
            {
            kw=(Token)match(input,14,FOLLOW_14_in_ruleOpOther729); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXLiteral"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:332:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:333:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:334:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral768);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral778); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:341:1: ruleXLiteral returns [EObject current=null] : (this_XBooleanLiteral_0= ruleXBooleanLiteral | this_XNullLiteral_1= ruleXNullLiteral | this_XStringLiteral_2= ruleXStringLiteral | this_DecimalLiteral_3= ruleDecimalLiteral | this_DateLiteral_4= ruleDateLiteral | this_DateTimeLiteral_5= ruleDateTimeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XBooleanLiteral_0 = null;

        EObject this_XNullLiteral_1 = null;

        EObject this_XStringLiteral_2 = null;

        EObject this_DecimalLiteral_3 = null;

        EObject this_DateLiteral_4 = null;

        EObject this_DateTimeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:344:28: ( (this_XBooleanLiteral_0= ruleXBooleanLiteral | this_XNullLiteral_1= ruleXNullLiteral | this_XStringLiteral_2= ruleXStringLiteral | this_DecimalLiteral_3= ruleDecimalLiteral | this_DateLiteral_4= ruleDateLiteral | this_DateTimeLiteral_5= ruleDateTimeLiteral ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:345:1: (this_XBooleanLiteral_0= ruleXBooleanLiteral | this_XNullLiteral_1= ruleXNullLiteral | this_XStringLiteral_2= ruleXStringLiteral | this_DecimalLiteral_3= ruleDecimalLiteral | this_DateLiteral_4= ruleDateLiteral | this_DateTimeLiteral_5= ruleDateTimeLiteral )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:345:1: (this_XBooleanLiteral_0= ruleXBooleanLiteral | this_XNullLiteral_1= ruleXNullLiteral | this_XStringLiteral_2= ruleXStringLiteral | this_DecimalLiteral_3= ruleDecimalLiteral | this_DateLiteral_4= ruleDateLiteral | this_DateTimeLiteral_5= ruleDateTimeLiteral )
            int alt4=6;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:346:5: this_XBooleanLiteral_0= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral825);
                    this_XBooleanLiteral_0=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:356:5: this_XNullLiteral_1= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral852);
                    this_XNullLiteral_1=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:366:5: this_XStringLiteral_2= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral879);
                    this_XStringLiteral_2=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:376:5: this_DecimalLiteral_3= ruleDecimalLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getDecimalLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDecimalLiteral_in_ruleXLiteral906);
                    this_DecimalLiteral_3=ruleDecimalLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DecimalLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:386:5: this_DateLiteral_4= ruleDateLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getDateLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDateLiteral_in_ruleXLiteral933);
                    this_DateLiteral_4=ruleDateLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DateLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:396:5: this_DateTimeLiteral_5= ruleDateTimeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getDateTimeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDateTimeLiteral_in_ruleXLiteral960);
                    this_DateTimeLiteral_5=ruleDateTimeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DateTimeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleDateLiteral"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:412:1: entryRuleDateLiteral returns [EObject current=null] : iv_ruleDateLiteral= ruleDateLiteral EOF ;
    public final EObject entryRuleDateLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateLiteral = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:413:2: (iv_ruleDateLiteral= ruleDateLiteral EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:414:2: iv_ruleDateLiteral= ruleDateLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDateLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleDateLiteral_in_entryRuleDateLiteral995);
            iv_ruleDateLiteral=ruleDateLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDateLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateLiteral1005); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateLiteral"


    // $ANTLR start "ruleDateLiteral"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:421:1: ruleDateLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDate ) ) ) ;
    public final EObject ruleDateLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:424:28: ( ( () ( (lv_value_1_0= ruleDate ) ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:425:1: ( () ( (lv_value_1_0= ruleDate ) ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:425:1: ( () ( (lv_value_1_0= ruleDate ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:425:2: () ( (lv_value_1_0= ruleDate ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:425:2: ()
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:426:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDateLiteralAccess().getDateLiteralAction_0(),
                          current);
                  
            }

            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:431:2: ( (lv_value_1_0= ruleDate ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:432:1: (lv_value_1_0= ruleDate )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:432:1: (lv_value_1_0= ruleDate )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:433:3: lv_value_1_0= ruleDate
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDateLiteralAccess().getValueDateParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDate_in_ruleDateLiteral1060);
            lv_value_1_0=ruleDate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDateLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Date");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateLiteral"


    // $ANTLR start "entryRuleDateTimeLiteral"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:457:1: entryRuleDateTimeLiteral returns [EObject current=null] : iv_ruleDateTimeLiteral= ruleDateTimeLiteral EOF ;
    public final EObject entryRuleDateTimeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimeLiteral = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:458:2: (iv_ruleDateTimeLiteral= ruleDateTimeLiteral EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:459:2: iv_ruleDateTimeLiteral= ruleDateTimeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDateTimeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleDateTimeLiteral_in_entryRuleDateTimeLiteral1096);
            iv_ruleDateTimeLiteral=ruleDateTimeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDateTimeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeLiteral1106); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateTimeLiteral"


    // $ANTLR start "ruleDateTimeLiteral"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:466:1: ruleDateTimeLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDate_Time ) ) ) ;
    public final EObject ruleDateTimeLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:469:28: ( ( () ( (lv_value_1_0= ruleDate_Time ) ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:470:1: ( () ( (lv_value_1_0= ruleDate_Time ) ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:470:1: ( () ( (lv_value_1_0= ruleDate_Time ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:470:2: () ( (lv_value_1_0= ruleDate_Time ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:470:2: ()
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:471:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDateTimeLiteralAccess().getDateTimeLiteralAction_0(),
                          current);
                  
            }

            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:476:2: ( (lv_value_1_0= ruleDate_Time ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:477:1: (lv_value_1_0= ruleDate_Time )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:477:1: (lv_value_1_0= ruleDate_Time )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:478:3: lv_value_1_0= ruleDate_Time
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDateTimeLiteralAccess().getValueDate_TimeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDate_Time_in_ruleDateTimeLiteral1161);
            lv_value_1_0=ruleDate_Time();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDateTimeLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Date_Time");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateTimeLiteral"


    // $ANTLR start "entryRuleDecimalLiteral"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:502:1: entryRuleDecimalLiteral returns [EObject current=null] : iv_ruleDecimalLiteral= ruleDecimalLiteral EOF ;
    public final EObject entryRuleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalLiteral = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:503:2: (iv_ruleDecimalLiteral= ruleDecimalLiteral EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:504:2: iv_ruleDecimalLiteral= ruleDecimalLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleDecimalLiteral_in_entryRuleDecimalLiteral1197);
            iv_ruleDecimalLiteral=ruleDecimalLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalLiteral1207); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecimalLiteral"


    // $ANTLR start "ruleDecimalLiteral"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:511:1: ruleDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:514:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:515:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:515:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:515:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:515:2: ()
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:516:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDecimalLiteralAccess().getDecimalLiteralAction_0(),
                          current);
                  
            }

            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:521:2: ( (lv_value_1_0= ruleNumber ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:522:1: (lv_value_1_0= ruleNumber )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:522:1: (lv_value_1_0= ruleNumber )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:523:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDecimalLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleDecimalLiteral1262);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDecimalLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecimalLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:547:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:548:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:549:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral1298);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral1308); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:556:1: ruleXNullLiteral returns [EObject current=null] : ( () (otherlv_1= 'null' | otherlv_2= 'NULL' ) ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:559:28: ( ( () (otherlv_1= 'null' | otherlv_2= 'NULL' ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:560:1: ( () (otherlv_1= 'null' | otherlv_2= 'NULL' ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:560:1: ( () (otherlv_1= 'null' | otherlv_2= 'NULL' ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:560:2: () (otherlv_1= 'null' | otherlv_2= 'NULL' )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:560:2: ()
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:561:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:566:2: (otherlv_1= 'null' | otherlv_2= 'NULL' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:566:4: otherlv_1= 'null'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleXNullLiteral1355); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:571:7: otherlv_2= 'NULL'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXNullLiteral1373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXNullLiteralAccess().getNULLKeyword_1_1());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:583:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:584:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:585:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral1410);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral1420); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:592:1: ruleXBooleanLiteral returns [EObject current=null] : ( () ( (otherlv_1= 'false' | otherlv_2= 'FALSE' ) | ( ( (lv_isTrue_3_1= 'true' | lv_isTrue_3_2= 'TRUE' ) ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_isTrue_3_1=null;
        Token lv_isTrue_3_2=null;

         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:595:28: ( ( () ( (otherlv_1= 'false' | otherlv_2= 'FALSE' ) | ( ( (lv_isTrue_3_1= 'true' | lv_isTrue_3_2= 'TRUE' ) ) ) ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:596:1: ( () ( (otherlv_1= 'false' | otherlv_2= 'FALSE' ) | ( ( (lv_isTrue_3_1= 'true' | lv_isTrue_3_2= 'TRUE' ) ) ) ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:596:1: ( () ( (otherlv_1= 'false' | otherlv_2= 'FALSE' ) | ( ( (lv_isTrue_3_1= 'true' | lv_isTrue_3_2= 'TRUE' ) ) ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:596:2: () ( (otherlv_1= 'false' | otherlv_2= 'FALSE' ) | ( ( (lv_isTrue_3_1= 'true' | lv_isTrue_3_2= 'TRUE' ) ) ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:596:2: ()
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:597:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:602:2: ( (otherlv_1= 'false' | otherlv_2= 'FALSE' ) | ( ( (lv_isTrue_3_1= 'true' | lv_isTrue_3_2= 'TRUE' ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=17 && LA8_0<=18)) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=19 && LA8_0<=20)) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:602:3: (otherlv_1= 'false' | otherlv_2= 'FALSE' )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:602:3: (otherlv_1= 'false' | otherlv_2= 'FALSE' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==17) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==18) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:602:5: otherlv_1= 'false'
                            {
                            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleXBooleanLiteral1468); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:607:7: otherlv_2= 'FALSE'
                            {
                            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleXBooleanLiteral1486); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getXBooleanLiteralAccess().getFALSEKeyword_1_0_1());
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:612:6: ( ( (lv_isTrue_3_1= 'true' | lv_isTrue_3_2= 'TRUE' ) ) )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:612:6: ( ( (lv_isTrue_3_1= 'true' | lv_isTrue_3_2= 'TRUE' ) ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:613:1: ( (lv_isTrue_3_1= 'true' | lv_isTrue_3_2= 'TRUE' ) )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:613:1: ( (lv_isTrue_3_1= 'true' | lv_isTrue_3_2= 'TRUE' ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:614:1: (lv_isTrue_3_1= 'true' | lv_isTrue_3_2= 'TRUE' )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:614:1: (lv_isTrue_3_1= 'true' | lv_isTrue_3_2= 'TRUE' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==19) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==20) ) {
                        alt7=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:615:3: lv_isTrue_3_1= 'true'
                            {
                            lv_isTrue_3_1=(Token)match(input,19,FOLLOW_19_in_ruleXBooleanLiteral1513); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_isTrue_3_1, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                              	        }
                                     		setWithLastConsumed(current, "isTrue", true, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:627:8: lv_isTrue_3_2= 'TRUE'
                            {
                            lv_isTrue_3_2=(Token)match(input,20,FOLLOW_20_in_ruleXBooleanLiteral1542); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_isTrue_3_2, grammarAccess.getXBooleanLiteralAccess().getIsTrueTRUEKeyword_1_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                              	        }
                                     		setWithLastConsumed(current, "isTrue", true, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleDate"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:650:1: entryRuleDate returns [String current=null] : iv_ruleDate= ruleDate EOF ;
    public final String entryRuleDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDate = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:651:2: (iv_ruleDate= ruleDate EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:652:2: iv_ruleDate= ruleDate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDateRule()); 
            }
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate1596);
            iv_ruleDate=ruleDate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDate.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate1607); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:659:1: ruleDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:662:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:663:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:663:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:663:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate1647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getDateAccess().getINTTerminalRuleCall_0()); 
                  
            }
            kw=(Token)match(input,21,FOLLOW_21_in_ruleDate1665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDateAccess().getFullStopKeyword_1()); 
                  
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate1680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_2, grammarAccess.getDateAccess().getINTTerminalRuleCall_2()); 
                  
            }
            kw=(Token)match(input,21,FOLLOW_21_in_ruleDate1698); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDateAccess().getFullStopKeyword_3()); 
                  
            }
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate1713); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_4);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_4, grammarAccess.getDateAccess().getINTTerminalRuleCall_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleDate_Time"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:704:1: entryRuleDate_Time returns [String current=null] : iv_ruleDate_Time= ruleDate_Time EOF ;
    public final String entryRuleDate_Time() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDate_Time = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:705:2: (iv_ruleDate_Time= ruleDate_Time EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:706:2: iv_ruleDate_Time= ruleDate_Time EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDate_TimeRule()); 
            }
            pushFollow(FOLLOW_ruleDate_Time_in_entryRuleDate_Time1759);
            iv_ruleDate_Time=ruleDate_Time();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDate_Time.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate_Time1770); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDate_Time"


    // $ANTLR start "ruleDate_Time"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:713:1: ruleDate_Time returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Date_0= ruleDate this_INT_1= RULE_INT kw= ':' this_INT_3= RULE_INT kw= ':' this_INT_5= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDate_Time() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;
        Token this_INT_5=null;
        AntlrDatatypeRuleToken this_Date_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:716:28: ( (this_Date_0= ruleDate this_INT_1= RULE_INT kw= ':' this_INT_3= RULE_INT kw= ':' this_INT_5= RULE_INT ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:717:1: (this_Date_0= ruleDate this_INT_1= RULE_INT kw= ':' this_INT_3= RULE_INT kw= ':' this_INT_5= RULE_INT )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:717:1: (this_Date_0= ruleDate this_INT_1= RULE_INT kw= ':' this_INT_3= RULE_INT kw= ':' this_INT_5= RULE_INT )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:718:5: this_Date_0= ruleDate this_INT_1= RULE_INT kw= ':' this_INT_3= RULE_INT kw= ':' this_INT_5= RULE_INT
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDate_TimeAccess().getDateParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDate_in_ruleDate_Time1817);
            this_Date_0=ruleDate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Date_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate_Time1837); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getDate_TimeAccess().getINTTerminalRuleCall_1()); 
                  
            }
            kw=(Token)match(input,22,FOLLOW_22_in_ruleDate_Time1855); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDate_TimeAccess().getColonKeyword_2()); 
                  
            }
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate_Time1870); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_3, grammarAccess.getDate_TimeAccess().getINTTerminalRuleCall_3()); 
                  
            }
            kw=(Token)match(input,22,FOLLOW_22_in_ruleDate_Time1888); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDate_TimeAccess().getColonKeyword_4()); 
                  
            }
            this_INT_5=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate_Time1903); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_5);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_5, grammarAccess.getDate_TimeAccess().getINTTerminalRuleCall_5()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDate_Time"


    // $ANTLR start "entryRuleNumber"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:769:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:770:2: (iv_ruleNumber= ruleNumber EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:771:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1949);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1960); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:778:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT kw= '.' )? (this_INT_2= RULE_INT | this_EINT_3= RULE_EINT ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_EINT_3=null;

         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:781:28: ( ( (this_INT_0= RULE_INT kw= '.' )? (this_INT_2= RULE_INT | this_EINT_3= RULE_EINT ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:782:1: ( (this_INT_0= RULE_INT kw= '.' )? (this_INT_2= RULE_INT | this_EINT_3= RULE_EINT ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:782:1: ( (this_INT_0= RULE_INT kw= '.' )? (this_INT_2= RULE_INT | this_EINT_3= RULE_EINT ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:782:2: (this_INT_0= RULE_INT kw= '.' )? (this_INT_2= RULE_INT | this_EINT_3= RULE_EINT )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:782:2: (this_INT_0= RULE_INT kw= '.' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==21) ) {
                    int LA9_3 = input.LA(3);

                    if ( ((LA9_3>=RULE_INT && LA9_3<=RULE_EINT)) ) {
                        alt9=1;
                    }
                }
            }
            switch (alt9) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:782:7: this_INT_0= RULE_INT kw= '.'
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber2001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0_0()); 
                          
                    }
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleNumber2019); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:795:3: (this_INT_2= RULE_INT | this_EINT_3= RULE_EINT )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_EINT) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:795:8: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber2037); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_2, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:803:10: this_EINT_3= RULE_EINT
                    {
                    this_EINT_3=(Token)match(input,RULE_EINT,FOLLOW_RULE_EINT_in_ruleNumber2063); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EINT_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EINT_3, grammarAccess.getNumberAccess().getEINTTerminalRuleCall_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleXAssignment"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:818:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:819:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:820:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment2109);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment2119); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:827:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:830:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:831:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:831:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==23) ) {
                    alt12=1;
                }
                else if ( (LA12_1==EOF||(LA12_1>=RULE_INT && LA12_1<=RULE_ID)||(LA12_1>=14 && LA12_1<=22)||(LA12_1>=24 && LA12_1<=46)||(LA12_1>=48 && LA12_1<=51)||(LA12_1>=53 && LA12_1<=56)) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA12_0>=RULE_INT && LA12_0<=RULE_STRING)||(LA12_0>=15 && LA12_0<=20)||(LA12_0>=32 && LA12_0<=34)||LA12_0==39||LA12_0==44||LA12_0==50||LA12_0==55) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:831:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:831:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:831:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:831:3: ()
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:832:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:837:2: ( ( ruleValidID ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:838:1: ( ruleValidID )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:838:1: ( ruleValidID )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:839:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment2177);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2193);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:860:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:861:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:861:1: (lv_value_3_0= ruleXAssignment )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:862:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2213);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:879:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:879:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:880:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment2243);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:888:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==24) ) {
                        int LA11_1 = input.LA(2);

                        if ( (synpred3_InternalEL()) ) {
                            alt11=1;
                        }
                    }
                    switch (alt11) {
                        case 1 :
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:888:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:888:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:888:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:893:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:893:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:893:7: ()
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:894:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:899:2: ( ( ruleOpMultiAssign ) )
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:900:1: ( ruleOpMultiAssign )
                            {
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:900:1: ( ruleOpMultiAssign )
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:901:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2296);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:914:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:915:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:915:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:916:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2319);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:940:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:941:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:942:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2359);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign2370); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:949:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:952:28: (kw= '=' )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:954:2: kw= '='
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleOpSingleAssign2407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:967:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:968:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:969:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2447);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign2458); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:976:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:979:28: (kw= '+=' )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:981:2: kw= '+='
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpMultiAssign2495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:994:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:995:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:996:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2534);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression2544); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1003:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1006:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1007:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1007:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1008:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2591);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1016:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred4_InternalEL()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1016:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1016:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1016:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1021:6: ( () ( ( ruleOpOr ) ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1021:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1021:7: ()
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1022:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1027:2: ( ( ruleOpOr ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1028:1: ( ruleOpOr )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1028:1: ( ruleOpOr )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1029:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2644);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1042:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1043:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1043:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1044:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2667);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1068:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1069:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1070:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2706);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2717); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1077:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1080:28: (kw= '||' )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1082:2: kw= '||'
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOr2754); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1095:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1096:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1097:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2793);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2803); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1104:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1107:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1108:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1108:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1109:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2850);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1117:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred5_InternalEL()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1117:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1117:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1117:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1122:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1122:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1122:7: ()
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1123:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1128:2: ( ( ruleOpAnd ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1129:1: ( ruleOpAnd )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1129:1: ( ruleOpAnd )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1130:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2903);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1143:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1144:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1144:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1145:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2926);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1169:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1170:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1171:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2965);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2976); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1178:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1181:28: (kw= '&&' )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1183:2: kw= '&&'
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpAnd3013); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1196:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1197:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1198:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression3052);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression3062); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1205:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1208:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1209:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1209:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1210:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3109);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1218:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred6_InternalEL()) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==28) ) {
                    int LA15_3 = input.LA(2);

                    if ( (synpred6_InternalEL()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1218:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1218:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1218:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1223:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1223:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1223:7: ()
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1224:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1229:2: ( ( ruleOpEquality ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1230:1: ( ruleOpEquality )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1230:1: ( ruleOpEquality )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1231:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3162);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1244:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1245:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1245:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1246:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3185);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1270:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1271:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1272:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality3224);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality3235); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1279:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1282:28: ( (kw= '==' | kw= '!=' ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1283:1: (kw= '==' | kw= '!=' )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1283:1: (kw= '==' | kw= '!=' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            else if ( (LA16_0==28) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1284:2: kw= '=='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpEquality3273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1291:2: kw= '!='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpEquality3292); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleOpCompare"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1304:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1305:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1306:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare3333);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare3344); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1313:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1316:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1317:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1317:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt17=1;
                }
                break;
            case 30:
                {
                alt17=2;
                }
                break;
            case 31:
                {
                alt17=3;
                }
                break;
            case 32:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1318:2: kw= '>='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpCompare3382); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1325:2: kw= '<='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpCompare3401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1332:2: kw= '>'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpCompare3420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1339:2: kw= '<'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpCompare3439); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1352:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1353:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1354:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3479);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3489); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1361:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1364:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1365:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1365:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1366:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3536);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1374:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred7_InternalEL()) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==34) ) {
                    int LA18_3 = input.LA(2);

                    if ( (synpred7_InternalEL()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1374:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1374:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1374:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1379:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1379:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1379:7: ()
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1380:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1385:2: ( ( ruleOpAdd ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1386:1: ( ruleOpAdd )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1386:1: ( ruleOpAdd )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1387:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3589);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1400:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1401:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1401:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1402:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3612);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1426:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1427:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1428:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3651);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3662); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1435:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1438:28: ( (kw= '+' | kw= '-' ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1439:1: (kw= '+' | kw= '-' )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1439:1: (kw= '+' | kw= '-' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            else if ( (LA19_0==34) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1440:2: kw= '+'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpAdd3700); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1447:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpAdd3719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1460:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1461:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1462:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3759);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3769); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1469:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1472:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1473:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1473:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1474:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3816);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1482:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop20:
            do {
                int alt20=2;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    int LA20_2 = input.LA(2);

                    if ( (synpred8_InternalEL()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA20_3 = input.LA(2);

                    if ( (synpred8_InternalEL()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA20_4 = input.LA(2);

                    if ( (synpred8_InternalEL()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA20_5 = input.LA(2);

                    if ( (synpred8_InternalEL()) ) {
                        alt20=1;
                    }


                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1482:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1482:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1482:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1487:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1487:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1487:7: ()
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1488:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1493:2: ( ( ruleOpMulti ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1494:1: ( ruleOpMulti )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1494:1: ( ruleOpMulti )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1495:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3869);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1508:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1509:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1509:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1510:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3892);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1534:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1535:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1536:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3931);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3942); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1543:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1546:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1547:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1547:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt21=1;
                }
                break;
            case 36:
                {
                alt21=2;
                }
                break;
            case 37:
                {
                alt21=3;
                }
                break;
            case 38:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1548:2: kw= '*'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1555:2: kw= '**'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3999); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1562:2: kw= '/'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti4018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1569:2: kw= '%'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpMulti4037); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1582:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1583:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1584:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4077);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4087); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1591:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1594:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1595:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1595:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=33 && LA22_0<=34)||LA22_0==39) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=RULE_INT && LA22_0<=RULE_ID)||(LA22_0>=15 && LA22_0<=20)||LA22_0==32||LA22_0==44||LA22_0==50||LA22_0==55) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1595:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1595:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1595:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1595:3: ()
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1596:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1601:2: ( ( ruleOpUnary ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1602:1: ( ruleOpUnary )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1602:1: ( ruleOpUnary )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1603:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4145);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1616:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1617:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1617:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1618:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4166);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1636:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4195);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1652:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1653:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1654:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4231);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4242); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1661:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1664:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1665:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1665:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt23=1;
                }
                break;
            case 34:
                {
                alt23=2;
                }
                break;
            case 33:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1666:2: kw= '!'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpUnary4280); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1673:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpUnary4299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1680:2: kw= '+'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpUnary4318); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1693:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1694:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1695:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4358);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4368); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1702:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1705:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1706:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1706:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1707:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4415);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1715:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==40) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred9_InternalEL()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1715:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1715:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1715:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1717:5: ( () otherlv_2= 'as' )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1717:6: () otherlv_2= 'as'
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1717:6: ()
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1718:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXCastedExpression4450); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1727:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1728:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1728:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1729:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4473);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1753:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1754:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1755:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4511);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4521); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1762:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1765:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1766:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1766:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1767:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4568);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1775:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop32:
            do {
                int alt32=3;
                switch ( input.LA(1) ) {
                case 21:
                    {
                    int LA32_2 = input.LA(2);

                    if ( (synpred10_InternalEL()) ) {
                        alt32=1;
                    }
                    else if ( (synpred11_InternalEL()) ) {
                        alt32=2;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA32_3 = input.LA(2);

                    if ( (synpred11_InternalEL()) ) {
                        alt32=2;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA32_4 = input.LA(2);

                    if ( (synpred11_InternalEL()) ) {
                        alt32=2;
                    }


                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1775:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1775:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1775:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1775:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1775:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1781:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1781:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1781:26: ()
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1782:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXMemberFeatureCall4617); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1791:1: ( ( ruleValidID ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1792:1: ( ruleValidID )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1792:1: ( ruleValidID )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1793:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4640);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4656);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1814:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1815:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1815:1: (lv_value_5_0= ruleXAssignment )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1816:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4678);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1833:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1833:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1833:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1833:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1833:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1849:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1849:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1849:8: ()
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1850:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1855:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt25=3;
            	    switch ( input.LA(1) ) {
            	    case 21:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1855:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleXMemberFeatureCall4764); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1860:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1860:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1861:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1861:1: (lv_nullSafe_8_0= '?.' )
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1862:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4788); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1876:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1876:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1877:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1877:1: (lv_spreading_9_0= '*.' )
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1878:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4825); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1891:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==32) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1891:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleXMemberFeatureCall4854); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1895:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1896:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1896:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1897:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4875);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1913:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop26:
            	            do {
            	                int alt26=2;
            	                int LA26_0 = input.LA(1);

            	                if ( (LA26_0==43) ) {
            	                    alt26=1;
            	                }


            	                switch (alt26) {
            	            	case 1 :
            	            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1913:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4888); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1917:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1918:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1918:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1919:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4909);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop26;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,31,FOLLOW_31_in_ruleXMemberFeatureCall4923); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1939:3: ( ( ruleValidID ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1940:1: ( ruleValidID )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1940:1: ( ruleValidID )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1941:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4948);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1954:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt30=2;
            	    alt30 = dfa30.predict(input);
            	    switch (alt30) {
            	        case 1 :
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1954:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1954:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1954:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1961:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1962:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4982); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1975:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt29=3;
            	            alt29 = dfa29.predict(input);
            	            switch (alt29) {
            	                case 1 :
            	                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1975:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1975:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1975:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1992:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1993:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5067);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2010:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2010:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2010:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2010:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2011:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2011:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2012:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5095);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2028:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop28:
            	                    do {
            	                        int alt28=2;
            	                        int LA28_0 = input.LA(1);

            	                        if ( (LA28_0==43) ) {
            	                            alt28=1;
            	                        }


            	                        switch (alt28) {
            	                    	case 1 :
            	                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2028:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall5108); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2032:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2033:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2033:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2034:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5129);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop28;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall5146); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2054:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==46) && (synpred14_InternalEL())) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2054:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2057:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2058:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5181);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXClosure"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2082:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2083:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2084:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5221);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5231); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2091:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2094:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2095:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2095:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2095:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2095:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2095:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2097:5: ( () otherlv_1= '[' )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2097:6: () otherlv_1= '['
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2097:6: ()
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2098:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleXClosure5291); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2107:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2107:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2122:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2122:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2122:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ID||LA34_0==44||LA34_0==58) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2122:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2122:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2123:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2123:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2124:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5364);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2140:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==43) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2140:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleXClosure5377); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2144:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2145:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2145:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2146:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5398);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2162:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2163:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2163:1: (lv_explicitSyntax_5_0= '|' )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2164:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,47,FOLLOW_47_in_ruleXClosure5420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_1_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2177:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2178:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2178:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2179:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5457);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleXClosure5469); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2207:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2208:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2209:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5505);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5515); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2216:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2219:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2220:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2220:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2220:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2220:2: ()
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2221:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2226:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_INT && LA37_0<=RULE_ID)||(LA37_0>=15 && LA37_0<=20)||(LA37_0>=32 && LA37_0<=34)||LA37_0==39||LA37_0==44||LA37_0==50||(LA37_0>=53 && LA37_0<=55)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2226:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2226:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2227:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2227:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2228:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5571);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2244:2: (otherlv_2= ';' )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==49) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2244:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXExpressionInClosure5584); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2256:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2257:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2258:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5624);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5634); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2265:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2268:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2269:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2269:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2269:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2269:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2269:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2285:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2285:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2285:7: ()
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2286:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2291:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID||LA39_0==44||LA39_0==58) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2291:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2291:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2292:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2292:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2293:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5742);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2309:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==43) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2309:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXShortClosure5755); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2313:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2314:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2314:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2315:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5776);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2331:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2332:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2332:1: (lv_explicitSyntax_4_0= '|' )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2333:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,47,FOLLOW_47_in_ruleXShortClosure5798); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2346:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2347:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2347:1: (lv_expression_5_0= ruleXExpression )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2348:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5834);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2372:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2373:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2374:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5870);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5880); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2381:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2384:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2385:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2385:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2385:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleXParenthesizedExpression5917); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5939);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXParenthesizedExpression5950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2410:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2411:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2412:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5986);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5996); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2419:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2422:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2423:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2423:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2423:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2423:2: ()
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2424:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXIfExpression6042); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXIfExpression6054); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2437:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2438:1: (lv_if_3_0= ruleXExpression )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2438:1: (lv_if_3_0= ruleXExpression )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2439:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6075);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXIfExpression6087); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2459:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2460:1: (lv_then_5_0= ruleXExpression )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2460:1: (lv_then_5_0= ruleXExpression )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2461:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6108);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2477:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==51) ) {
                int LA40_1 = input.LA(2);

                if ( (synpred18_InternalEL()) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2477:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2477:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2477:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleXIfExpression6129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2482:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2483:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2483:1: (lv_else_7_0= ruleXExpression )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2484:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6151);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2510:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2511:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2512:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6191);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6201); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2519:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2522:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2523:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2523:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2523:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2523:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||LA41_0==44||LA41_0==58) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2524:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2524:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2525:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6247);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2541:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==52) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2541:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXCasePart6261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2545:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2546:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2546:1: (lv_case_2_0= ruleXExpression )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2547:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6282);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleXCasePart6296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2567:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2568:1: (lv_then_4_0= ruleXExpression )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2568:1: (lv_then_4_0= ruleXExpression )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2569:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6317);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2601:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2602:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2603:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6361);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6371); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2610:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2613:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2614:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2614:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=53 && LA43_0<=54)) ) {
                alt43=1;
            }
            else if ( ((LA43_0>=RULE_INT && LA43_0<=RULE_ID)||(LA43_0>=15 && LA43_0<=20)||(LA43_0>=32 && LA43_0<=34)||LA43_0==39||LA43_0==44||LA43_0==50||LA43_0==55) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2615:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock6418);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2625:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock6445);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2641:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2642:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2643:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration6480);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration6490); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2650:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2653:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2654:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2654:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2654:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2654:2: ()
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2655:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2660:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==53) ) {
                alt44=1;
            }
            else if ( (LA44_0==54) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2660:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2660:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2661:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2661:1: (lv_writeable_1_0= 'var' )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2662:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,53,FOLLOW_53_in_ruleXVariableDeclaration6543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2676:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleXVariableDeclaration6574); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2680:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                int LA45_1 = input.LA(2);

                if ( (synpred19_InternalEL()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA45_0==44) && (synpred19_InternalEL())) {
                alt45=1;
            }
            else if ( (LA45_0==58) && (synpred19_InternalEL())) {
                alt45=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2680:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2680:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2680:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2688:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2688:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2688:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2689:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2689:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2690:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration6622);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2706:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2707:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2707:1: (lv_name_4_0= ruleValidID )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2708:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration6643);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2725:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2725:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2726:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2726:1: (lv_name_5_0= ruleValidID )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2727:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration6672);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2743:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==23) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2743:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleXVariableDeclaration6686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2747:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2748:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2748:1: (lv_right_7_0= ruleXExpression )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2749:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration6707);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2773:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2774:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2775:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter6745);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter6755); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2782:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2785:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2786:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2786:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2786:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2786:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==RULE_ID||LA47_1==21||LA47_1==32||LA47_1==46) ) {
                    alt47=1;
                }
            }
            else if ( (LA47_0==44||LA47_0==58) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2787:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2787:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2788:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter6801);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2804:3: ( (lv_name_1_0= ruleValidID ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2805:1: (lv_name_1_0= ruleValidID )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2805:1: (lv_name_1_0= ruleValidID )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2806:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter6823);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2830:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2831:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2832:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter6859);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter6869); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2839:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2842:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2843:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2843:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2843:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2843:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2844:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2844:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2845:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter6915);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2861:2: ( (lv_name_1_0= ruleValidID ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2862:1: (lv_name_1_0= ruleValidID )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2862:1: (lv_name_1_0= ruleValidID )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2863:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter6936);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2887:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2888:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2889:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall6972);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall6982); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2896:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2899:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2900:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2900:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2900:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2900:2: ()
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2901:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2906:2: ( ( ruleStaticQualifier ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==56) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2907:1: ( ruleStaticQualifier )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2907:1: ( ruleStaticQualifier )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2908:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7039);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2921:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==32) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2921:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleXFeatureCall7053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2925:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2926:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2926:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2927:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7074);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2943:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==43) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2943:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall7087); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2947:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2948:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2948:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2949:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7108);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleXFeatureCall7122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2969:3: ( ( ruleIdOrSuper ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2970:1: ( ruleIdOrSuper )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2970:1: ( ruleIdOrSuper )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2971:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7147);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2984:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2984:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2984:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2984:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2991:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2992:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,44,FOLLOW_44_in_ruleXFeatureCall7181); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3005:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt52=3;
                    alt52 = dfa52.predict(input);
                    switch (alt52) {
                        case 1 :
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3005:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3005:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3005:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3022:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3023:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7266);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3040:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3040:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3040:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3040:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3041:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3041:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3042:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7294);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3058:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==43) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3058:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall7307); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3062:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3063:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3063:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3064:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7328);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop51;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,45,FOLLOW_45_in_ruleXFeatureCall7345); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3084:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==46) && (synpred22_InternalEL())) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3084:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3087:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3088:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall7380);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3112:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3113:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3114:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper7418);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper7429); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3121:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3124:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3125:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3125:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            else if ( (LA55_0==55) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3126:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper7476);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3138:2: kw= 'super'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleIdOrSuper7500); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3151:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3152:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3153:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier7541);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier7552); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3160:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3163:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3164:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3164:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ID) ) {
                    int LA56_2 = input.LA(2);

                    if ( (LA56_2==56) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3165:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier7599);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,56,FOLLOW_56_in_ruleStaticQualifier7617); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt56 >= 1 ) break loop56;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3193:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3194:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3195:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral7662);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral7672); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3202:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3205:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3206:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3206:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3206:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3206:2: ()
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3207:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3212:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3213:1: (lv_value_1_0= RULE_STRING )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3213:1: (lv_value_1_0= RULE_STRING )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3214:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral7723); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXCatchClause"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3246:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3247:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3248:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause7772);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause7782); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3255:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3258:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3259:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3259:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3259:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3259:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3259:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleXCatchClause7827); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleXCatchClause7840); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3268:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3269:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3269:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3270:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause7861);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleXCatchClause7873); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3290:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3291:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3291:1: (lv_expression_4_0= ruleXExpression )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3292:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause7894);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3316:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3317:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3318:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName7931);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName7942); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3325:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3328:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3329:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3329:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3330:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName7989);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3340:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==21) ) {
                    int LA57_2 = input.LA(2);

                    if ( (LA57_2==RULE_ID) ) {
                        int LA57_3 = input.LA(3);

                        if ( (synpred24_InternalEL()) ) {
                            alt57=1;
                        }


                    }


                }


                switch (alt57) {
            	case 1 :
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3340:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3340:2: ( ( '.' )=>kw= '.' )
            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3340:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_ruleQualifiedName8017); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName8040);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3367:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3368:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3369:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference8087);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference8097); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3376:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3379:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3380:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3380:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            else if ( (LA59_0==44||LA59_0==58) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3380:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3380:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3381:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference8145);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3389:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==46) && (synpred25_InternalEL())) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3389:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3392:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3392:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3392:6: ()
                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3393:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleJvmTypeReference8183); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleJvmTypeReference8195); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3408:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference8227);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3424:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3425:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3426:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef8262);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef8272); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3433:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3436:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3437:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3437:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3437:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3437:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==44) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3437:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleXFunctionTypeRef8310); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3441:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_ID||LA61_0==44||LA61_0==58) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3441:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3441:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3442:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3442:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3443:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef8332);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3459:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==43) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3459:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXFunctionTypeRef8345); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3463:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3464:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3464:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3465:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef8366);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop60;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXFunctionTypeRef8382); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,58,FOLLOW_58_in_ruleXFunctionTypeRef8396); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3489:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3490:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3490:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3491:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef8417);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3515:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3516:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3517:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference8453);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference8463); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3524:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3527:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3528:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3528:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3528:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3528:2: ( ( ruleQualifiedName ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3529:1: ( ruleQualifiedName )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3529:1: ( ruleQualifiedName )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3530:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference8511);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3543:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3543:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3543:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3543:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleJvmParameterizedTypeReference8532); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3548:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3549:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3549:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3550:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference8554);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3566:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==43) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3566:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleJvmParameterizedTypeReference8567); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3570:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3571:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3571:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3572:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference8588);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleJvmParameterizedTypeReference8602); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3600:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3601:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3602:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference8640);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference8650); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3609:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3612:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3613:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3613:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID||LA65_0==44||LA65_0==58) ) {
                alt65=1;
            }
            else if ( (LA65_0==59) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3614:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference8697);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3624:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference8724);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3640:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3641:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3642:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference8759);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference8769); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3649:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3652:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3653:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3653:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3653:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3653:2: ()
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3654:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleJvmWildcardTypeReference8815); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3663:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt66=3;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==60) ) {
                alt66=1;
            }
            else if ( (LA66_0==55) ) {
                alt66=2;
            }
            switch (alt66) {
                case 1 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3663:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3663:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3664:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3664:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3665:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference8837);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3682:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3682:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3683:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3683:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3684:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference8864);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3708:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3709:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3710:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound8902);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound8912); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3717:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3720:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3721:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3721:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3721:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleJvmUpperBound8949); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3725:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3726:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3726:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3727:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound8970);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3751:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3752:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3753:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded9006);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded9016); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3760:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3763:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3764:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3764:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3764:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleJvmUpperBoundAnded9053); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3768:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3769:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3769:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3770:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded9074);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3794:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3795:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3796:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound9110);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound9120); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3803:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3806:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3807:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3807:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3807:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleJvmLowerBound9157); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3811:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3812:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3812:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3813:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound9178);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3839:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3840:2: (iv_ruleValidID= ruleValidID EOF )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3841:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID9217);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID9228); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3848:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3851:28: (this_ID_0= RULE_ID )
            // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3852:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID9267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalEL
    public final void synpred1_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:179:3: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:179:4: ( () ( ( ruleOpCompare ) ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:179:4: ( () ( ( ruleOpCompare ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:179:5: () ( ( ruleOpCompare ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:179:5: ()
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:180:1: 
        {
        }

        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:180:2: ( ( ruleOpCompare ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:181:1: ( ruleOpCompare )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:181:1: ( ruleOpCompare )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:182:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred1_InternalEL416);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalEL

    // $ANTLR start synpred2_InternalEL
    public final void synpred2_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:253:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:253:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:253:4: ( () ( ( ruleOpOther ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:253:5: () ( ( ruleOpOther ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:253:5: ()
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:254:1: 
        {
        }

        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:254:2: ( ( ruleOpOther ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:255:1: ( ruleOpOther )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:255:1: ( ruleOpOther )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:256:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred2_InternalEL587);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalEL

    // $ANTLR start synpred3_InternalEL
    public final void synpred3_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:888:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:888:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:888:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:888:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:888:5: ()
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:889:1: 
        {
        }

        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:889:2: ( ( ruleOpMultiAssign ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:890:1: ( ruleOpMultiAssign )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:890:1: ( ruleOpMultiAssign )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:891:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred3_InternalEL2264);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalEL

    // $ANTLR start synpred4_InternalEL
    public final void synpred4_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1016:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1016:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1016:4: ( () ( ( ruleOpOr ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1016:5: () ( ( ruleOpOr ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1016:5: ()
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1017:1: 
        {
        }

        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1017:2: ( ( ruleOpOr ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1018:1: ( ruleOpOr )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1018:1: ( ruleOpOr )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1019:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred4_InternalEL2612);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalEL

    // $ANTLR start synpred5_InternalEL
    public final void synpred5_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1117:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1117:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1117:4: ( () ( ( ruleOpAnd ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1117:5: () ( ( ruleOpAnd ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1117:5: ()
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1118:1: 
        {
        }

        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1118:2: ( ( ruleOpAnd ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1119:1: ( ruleOpAnd )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1119:1: ( ruleOpAnd )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1120:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred5_InternalEL2871);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalEL

    // $ANTLR start synpred6_InternalEL
    public final void synpred6_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1218:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1218:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1218:4: ( () ( ( ruleOpEquality ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1218:5: () ( ( ruleOpEquality ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1218:5: ()
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1219:1: 
        {
        }

        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1219:2: ( ( ruleOpEquality ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1220:1: ( ruleOpEquality )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1220:1: ( ruleOpEquality )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1221:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred6_InternalEL3130);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalEL

    // $ANTLR start synpred7_InternalEL
    public final void synpred7_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1374:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1374:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1374:4: ( () ( ( ruleOpAdd ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1374:5: () ( ( ruleOpAdd ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1374:5: ()
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1375:1: 
        {
        }

        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1375:2: ( ( ruleOpAdd ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1376:1: ( ruleOpAdd )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1376:1: ( ruleOpAdd )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1377:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred7_InternalEL3557);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalEL

    // $ANTLR start synpred8_InternalEL
    public final void synpred8_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1482:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1482:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1482:4: ( () ( ( ruleOpMulti ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1482:5: () ( ( ruleOpMulti ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1482:5: ()
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1483:1: 
        {
        }

        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1483:2: ( ( ruleOpMulti ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1484:1: ( ruleOpMulti )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1484:1: ( ruleOpMulti )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1485:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred8_InternalEL3837);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalEL

    // $ANTLR start synpred9_InternalEL
    public final void synpred9_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1715:3: ( ( () 'as' ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1715:4: ( () 'as' )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1715:4: ( () 'as' )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1715:5: () 'as'
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1715:5: ()
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1716:1: 
        {
        }

        match(input,40,FOLLOW_40_in_synpred9_InternalEL4431); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalEL

    // $ANTLR start synpred10_InternalEL
    public final void synpred10_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1775:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1775:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1775:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1775:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1775:6: ()
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1776:1: 
        {
        }

        match(input,21,FOLLOW_21_in_synpred10_InternalEL4585); if (state.failed) return ;
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1777:1: ( ( ruleValidID ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1778:1: ( ruleValidID )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1778:1: ( ruleValidID )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1779:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred10_InternalEL4594);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred10_InternalEL4600);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalEL

    // $ANTLR start synpred11_InternalEL
    public final void synpred11_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1833:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1833:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1833:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1833:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1833:10: ()
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1834:1: 
        {
        }

        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1834:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt67=3;
        switch ( input.LA(1) ) {
        case 21:
            {
            alt67=1;
            }
            break;
        case 41:
            {
            alt67=2;
            }
            break;
        case 42:
            {
            alt67=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 67, 0, input);

            throw nvae;
        }

        switch (alt67) {
            case 1 :
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1834:4: '.'
                {
                match(input,21,FOLLOW_21_in_synpred11_InternalEL4703); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1836:6: ( ( '?.' ) )
                {
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1836:6: ( ( '?.' ) )
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1837:1: ( '?.' )
                {
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1837:1: ( '?.' )
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1838:2: '?.'
                {
                match(input,41,FOLLOW_41_in_synpred11_InternalEL4717); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1843:6: ( ( '*.' ) )
                {
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1843:6: ( ( '*.' ) )
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1844:1: ( '*.' )
                {
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1844:1: ( '*.' )
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1845:2: '*.'
                {
                match(input,42,FOLLOW_42_in_synpred11_InternalEL4737); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred11_InternalEL

    // $ANTLR start synpred12_InternalEL
    public final void synpred12_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1954:4: ( ( '(' ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1955:1: ( '(' )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1955:1: ( '(' )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1956:2: '('
        {
        match(input,44,FOLLOW_44_in_synpred12_InternalEL4964); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalEL

    // $ANTLR start synpred13_InternalEL
    public final void synpred13_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1975:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1975:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1975:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1975:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1975:6: ()
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1976:1: 
        {
        }

        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1976:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt69=2;
        int LA69_0 = input.LA(1);

        if ( (LA69_0==RULE_ID||LA69_0==44||LA69_0==58) ) {
            alt69=1;
        }
        switch (alt69) {
            case 1 :
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1976:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1976:3: ( ( ruleJvmFormalParameter ) )
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1977:1: ( ruleJvmFormalParameter )
                {
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1977:1: ( ruleJvmFormalParameter )
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1978:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred13_InternalEL5016);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1980:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop68:
                do {
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==43) ) {
                        alt68=1;
                    }


                    switch (alt68) {
                	case 1 :
                	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1980:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred13_InternalEL5023); if (state.failed) return ;
                	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1981:1: ( ( ruleJvmFormalParameter ) )
                	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1982:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1982:1: ( ruleJvmFormalParameter )
                	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1983:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred13_InternalEL5030);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop68;
                    }
                } while (true);


                }
                break;

        }

        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1985:6: ( ( '|' ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1986:1: ( '|' )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1986:1: ( '|' )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:1987:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred13_InternalEL5044); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalEL

    // $ANTLR start synpred14_InternalEL
    public final void synpred14_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2054:4: ( ( () '[' ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2054:5: ( () '[' )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2054:5: ( () '[' )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2054:6: () '['
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2054:6: ()
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2055:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred14_InternalEL5164); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalEL

    // $ANTLR start synpred16_InternalEL
    public final void synpred16_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2107:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2107:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2107:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2107:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2107:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt71=2;
        int LA71_0 = input.LA(1);

        if ( (LA71_0==RULE_ID||LA71_0==44||LA71_0==58) ) {
            alt71=1;
        }
        switch (alt71) {
            case 1 :
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2107:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2107:7: ( ( ruleJvmFormalParameter ) )
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2108:1: ( ruleJvmFormalParameter )
                {
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2108:1: ( ruleJvmFormalParameter )
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2109:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalEL5310);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2111:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop70:
                do {
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==43) ) {
                        alt70=1;
                    }


                    switch (alt70) {
                	case 1 :
                	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2111:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred16_InternalEL5317); if (state.failed) return ;
                	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2112:1: ( ( ruleJvmFormalParameter ) )
                	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2113:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2113:1: ( ruleJvmFormalParameter )
                	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2114:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalEL5324);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop70;
                    }
                } while (true);


                }
                break;

        }

        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2116:6: ( ( '|' ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2117:1: ( '|' )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2117:1: ( '|' )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2118:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred16_InternalEL5338); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalEL

    // $ANTLR start synpred18_InternalEL
    public final void synpred18_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2477:4: ( 'else' )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2477:6: 'else'
        {
        match(input,51,FOLLOW_51_in_synpred18_InternalEL6121); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalEL

    // $ANTLR start synpred19_InternalEL
    public final void synpred19_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2680:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2680:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2680:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2680:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2680:6: ( ( ruleJvmTypeReference ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2681:1: ( ruleJvmTypeReference )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2681:1: ( ruleJvmTypeReference )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2682:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred19_InternalEL6592);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2684:2: ( ( ruleValidID ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2685:1: ( ruleValidID )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2685:1: ( ruleValidID )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2686:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalEL6601);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred19_InternalEL

    // $ANTLR start synpred20_InternalEL
    public final void synpred20_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2984:4: ( ( '(' ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2985:1: ( '(' )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2985:1: ( '(' )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:2986:2: '('
        {
        match(input,44,FOLLOW_44_in_synpred20_InternalEL7163); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalEL

    // $ANTLR start synpred21_InternalEL
    public final void synpred21_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3005:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3005:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3005:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3005:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3005:6: ()
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3006:1: 
        {
        }

        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3006:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt75=2;
        int LA75_0 = input.LA(1);

        if ( (LA75_0==RULE_ID||LA75_0==44||LA75_0==58) ) {
            alt75=1;
        }
        switch (alt75) {
            case 1 :
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3006:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3006:3: ( ( ruleJvmFormalParameter ) )
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3007:1: ( ruleJvmFormalParameter )
                {
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3007:1: ( ruleJvmFormalParameter )
                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3008:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred21_InternalEL7215);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3010:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop74:
                do {
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==43) ) {
                        alt74=1;
                    }


                    switch (alt74) {
                	case 1 :
                	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3010:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred21_InternalEL7222); if (state.failed) return ;
                	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3011:1: ( ( ruleJvmFormalParameter ) )
                	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3012:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3012:1: ( ruleJvmFormalParameter )
                	    // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3013:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred21_InternalEL7229);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop74;
                    }
                } while (true);


                }
                break;

        }

        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3015:6: ( ( '|' ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3016:1: ( '|' )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3016:1: ( '|' )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3017:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred21_InternalEL7243); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred21_InternalEL

    // $ANTLR start synpred22_InternalEL
    public final void synpred22_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3084:4: ( ( () '[' ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3084:5: ( () '[' )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3084:5: ( () '[' )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3084:6: () '['
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3084:6: ()
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3085:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred22_InternalEL7363); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred22_InternalEL

    // $ANTLR start synpred24_InternalEL
    public final void synpred24_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3340:3: ( '.' )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3341:2: '.'
        {
        match(input,21,FOLLOW_21_in_synpred24_InternalEL8008); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalEL

    // $ANTLR start synpred25_InternalEL
    public final void synpred25_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3389:2: ( ( () '[' ']' ) )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3389:3: ( () '[' ']' )
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3389:3: ( () '[' ']' )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3389:4: () '[' ']'
        {
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3389:4: ()
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3390:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred25_InternalEL8160); if (state.failed) return ;
        match(input,48,FOLLOW_48_in_synpred25_InternalEL8164); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalEL

    // $ANTLR start synpred26_InternalEL
    public final void synpred26_InternalEL_fragment() throws RecognitionException {   
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3543:4: ( '<' )
        // ../ch.vorburger.el/src-gen/ch/vorburger/el/parser/antlr/internal/InternalEL.g:3543:6: '<'
        {
        match(input,32,FOLLOW_32_in_synpred26_InternalEL8524); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalEL

    // Delegated rules

    public final boolean synpred16_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA64 dfa64 = new DFA64(this);
    static final String DFA4_eotS =
        "\15\uffff";
    static final String DFA4_eofS =
        "\4\uffff\1\5\2\uffff\1\5\1\uffff\1\12\1\uffff\1\12\1\uffff";
    static final String DFA4_minS =
        "\1\4\3\uffff\1\4\1\uffff\4\4\1\uffff\1\4\1\uffff";
    static final String DFA4_maxS =
        "\1\24\3\uffff\1\67\1\uffff\1\40\1\67\1\40\1\67\1\uffff\1\67\1\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\4\uffff\1\5\1\uffff\1\6";
    static final String DFA4_specialS =
        "\15\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\4\1\5\1\3\10\uffff\2\2\4\1",
            "",
            "",
            "",
            "\4\5\6\uffff\7\5\1\6\1\5\1\uffff\26\5\2\uffff\4\5\1\uffff"+
            "\3\5",
            "",
            "\1\7\1\5\1\uffff\1\5\30\uffff\1\5",
            "\4\5\6\uffff\7\5\1\10\1\5\1\uffff\26\5\2\uffff\4\5\1\uffff"+
            "\3\5",
            "\1\11\2\uffff\1\5\30\uffff\1\5",
            "\1\13\3\12\6\uffff\11\12\1\uffff\26\12\2\uffff\4\12\1\uffff"+
            "\3\12",
            "",
            "\4\12\6\uffff\10\12\1\14\2\uffff\22\12\1\uffff\1\12\3\uffff"+
            "\3\12\2\uffff\3\12",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "345:1: (this_XBooleanLiteral_0= ruleXBooleanLiteral | this_XNullLiteral_1= ruleXNullLiteral | this_XStringLiteral_2= ruleXStringLiteral | this_DecimalLiteral_3= ruleDecimalLiteral | this_DateLiteral_4= ruleDateLiteral | this_DateTimeLiteral_5= ruleDateTimeLiteral )";
        }
    }
    static final String DFA30_eotS =
        "\56\uffff";
    static final String DFA30_eofS =
        "\1\2\55\uffff";
    static final String DFA30_minS =
        "\1\4\1\0\54\uffff";
    static final String DFA30_maxS =
        "\1\67\1\0\54\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\52\uffff\1\1";
    static final String DFA30_specialS =
        "\1\uffff\1\0\54\uffff}>";
    static final String[] DFA30_transitionS = {
            "\4\2\6\uffff\11\2\1\uffff\24\2\1\1\2\2\1\uffff\4\2\1\uffff"+
            "\3\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1954:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalEL()) ) {s = 45;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\25\uffff";
    static final String DFA29_eofS =
        "\25\uffff";
    static final String DFA29_minS =
        "\1\4\2\0\22\uffff";
    static final String DFA29_maxS =
        "\1\72\2\0\22\uffff";
    static final String DFA29_acceptS =
        "\3\uffff\2\1\1\2\16\uffff\1\3";
    static final String DFA29_specialS =
        "\1\0\1\1\1\2\22\uffff}>";
    static final String[] DFA29_transitionS = {
            "\3\5\1\1\7\uffff\6\5\13\uffff\3\5\4\uffff\1\5\4\uffff\1\2\1"+
            "\24\1\uffff\1\4\2\uffff\1\5\4\uffff\1\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1975:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_0 = input.LA(1);

                         
                        int index29_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA29_0==RULE_ID) ) {s = 1;}

                        else if ( (LA29_0==44) ) {s = 2;}

                        else if ( (LA29_0==58) && (synpred13_InternalEL())) {s = 3;}

                        else if ( (LA29_0==47) && (synpred13_InternalEL())) {s = 4;}

                        else if ( ((LA29_0>=RULE_INT && LA29_0<=RULE_STRING)||(LA29_0>=15 && LA29_0<=20)||(LA29_0>=32 && LA29_0<=34)||LA29_0==39||LA29_0==50||LA29_0==55) ) {s = 5;}

                        else if ( (LA29_0==45) ) {s = 20;}

                         
                        input.seek(index29_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalEL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_2 = input.LA(1);

                         
                        int index29_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalEL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index29_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\27\uffff";
    static final String DFA35_eofS =
        "\27\uffff";
    static final String DFA35_minS =
        "\1\4\2\0\24\uffff";
    static final String DFA35_maxS =
        "\1\72\2\0\24\uffff";
    static final String DFA35_acceptS =
        "\3\uffff\2\1\1\2\21\uffff";
    static final String DFA35_specialS =
        "\1\0\1\1\1\2\24\uffff}>";
    static final String[] DFA35_transitionS = {
            "\3\5\1\1\7\uffff\6\5\13\uffff\3\5\4\uffff\1\5\4\uffff\1\2\2"+
            "\uffff\1\4\1\5\1\uffff\1\5\2\uffff\3\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "2107:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_0 = input.LA(1);

                         
                        int index35_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA35_0==RULE_ID) ) {s = 1;}

                        else if ( (LA35_0==44) ) {s = 2;}

                        else if ( (LA35_0==58) && (synpred16_InternalEL())) {s = 3;}

                        else if ( (LA35_0==47) && (synpred16_InternalEL())) {s = 4;}

                        else if ( ((LA35_0>=RULE_INT && LA35_0<=RULE_STRING)||(LA35_0>=15 && LA35_0<=20)||(LA35_0>=32 && LA35_0<=34)||LA35_0==39||LA35_0==48||LA35_0==50||(LA35_0>=53 && LA35_0<=55)) ) {s = 5;}

                         
                        input.seek(index35_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalEL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_2 = input.LA(1);

                         
                        int index35_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalEL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\56\uffff";
    static final String DFA53_eofS =
        "\1\2\55\uffff";
    static final String DFA53_minS =
        "\1\4\1\0\54\uffff";
    static final String DFA53_maxS =
        "\1\67\1\0\54\uffff";
    static final String DFA53_acceptS =
        "\2\uffff\1\2\52\uffff\1\1";
    static final String DFA53_specialS =
        "\1\uffff\1\0\54\uffff}>";
    static final String[] DFA53_transitionS = {
            "\4\2\6\uffff\11\2\1\uffff\24\2\1\1\2\2\1\uffff\4\2\1\uffff"+
            "\3\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "2984:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_1 = input.LA(1);

                         
                        int index53_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalEL()) ) {s = 45;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index53_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA52_eotS =
        "\25\uffff";
    static final String DFA52_eofS =
        "\25\uffff";
    static final String DFA52_minS =
        "\1\4\2\0\22\uffff";
    static final String DFA52_maxS =
        "\1\72\2\0\22\uffff";
    static final String DFA52_acceptS =
        "\3\uffff\2\1\1\2\16\uffff\1\3";
    static final String DFA52_specialS =
        "\1\0\1\1\1\2\22\uffff}>";
    static final String[] DFA52_transitionS = {
            "\3\5\1\1\7\uffff\6\5\13\uffff\3\5\4\uffff\1\5\4\uffff\1\2\1"+
            "\24\1\uffff\1\4\2\uffff\1\5\4\uffff\1\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "3005:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_0 = input.LA(1);

                         
                        int index52_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA52_0==RULE_ID) ) {s = 1;}

                        else if ( (LA52_0==44) ) {s = 2;}

                        else if ( (LA52_0==58) && (synpred21_InternalEL())) {s = 3;}

                        else if ( (LA52_0==47) && (synpred21_InternalEL())) {s = 4;}

                        else if ( ((LA52_0>=RULE_INT && LA52_0<=RULE_STRING)||(LA52_0>=15 && LA52_0<=20)||(LA52_0>=32 && LA52_0<=34)||LA52_0==39||LA52_0==50||LA52_0==55) ) {s = 5;}

                        else if ( (LA52_0==45) ) {s = 20;}

                         
                        input.seek(index52_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA52_1 = input.LA(1);

                         
                        int index52_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalEL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index52_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA52_2 = input.LA(1);

                         
                        int index52_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalEL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index52_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\57\uffff";
    static final String DFA64_eofS =
        "\1\2\56\uffff";
    static final String DFA64_minS =
        "\1\4\1\0\55\uffff";
    static final String DFA64_maxS =
        "\1\67\1\0\55\uffff";
    static final String DFA64_acceptS =
        "\2\uffff\1\2\53\uffff\1\1";
    static final String DFA64_specialS =
        "\1\uffff\1\0\55\uffff}>";
    static final String[] DFA64_transitionS = {
            "\4\2\6\uffff\11\2\1\uffff\10\2\1\1\16\2\1\uffff\10\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "3543:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEL()) ) {s = 46;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXExpression131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression395 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression448 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression471 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression566 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression619 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression642 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOpOther729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalLiteral_in_ruleXLiteral906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateLiteral_in_ruleXLiteral933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeLiteral_in_ruleXLiteral960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateLiteral_in_entryRuleDateLiteral995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateLiteral1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_ruleDateLiteral1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeLiteral_in_entryRuleDateTimeLiteral1096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeLiteral1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_Time_in_ruleDateTimeLiteral1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalLiteral_in_entryRuleDecimalLiteral1197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalLiteral1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleDecimalLiteral1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral1298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleXNullLiteral1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleXNullLiteral1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral1410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleXBooleanLiteral1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleXBooleanLiteral1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleXBooleanLiteral1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleXBooleanLiteral1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate1596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate1647 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDate1665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate1680 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDate1698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_Time_in_entryRuleDate_Time1759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate_Time1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_ruleDate_Time1817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate_Time1837 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDate_Time1855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate_Time1870 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDate_Time1888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate_Time1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber2001 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleNumber2019 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EINT_in_ruleNumber2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment2109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment2177 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2193 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment2243 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2296 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpSingleAssign2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpMultiAssign2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2591 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2644 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2667 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOr2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2850 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2903 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2926 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpAnd3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression3052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3109 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3162 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3185 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality3224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpEquality3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpEquality3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare3333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpCompare3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpCompare3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpCompare3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpCompare3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3536 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3589 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3612 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpAdd3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpAdd3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3816 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3869 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3892 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpMulti4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4145 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpUnary4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpUnary4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpUnary4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4415 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleXCastedExpression4450 = new BitSet(new long[]{0x0400100000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4473 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4568 = new BitSet(new long[]{0x0000060000200002L});
    public static final BitSet FOLLOW_21_in_ruleXMemberFeatureCall4617 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4640 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4656 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4678 = new BitSet(new long[]{0x0000060000200002L});
    public static final BitSet FOLLOW_21_in_ruleXMemberFeatureCall4764 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4788 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4825 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_32_in_ruleXMemberFeatureCall4854 = new BitSet(new long[]{0x0C00100000000080L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4875 = new BitSet(new long[]{0x0000080080000000L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4888 = new BitSet(new long[]{0x0C00100000000080L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4909 = new BitSet(new long[]{0x0000080080000000L});
    public static final BitSet FOLLOW_31_in_ruleXMemberFeatureCall4923 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4948 = new BitSet(new long[]{0x0000560000200002L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4982 = new BitSet(new long[]{0x0484B087001F80F0L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5067 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5095 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall5108 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5129 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall5146 = new BitSet(new long[]{0x0000460000200002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5181 = new BitSet(new long[]{0x0000060000200002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXClosure5291 = new BitSet(new long[]{0x04E59087001F80F0L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5364 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_ruleXClosure5377 = new BitSet(new long[]{0x0400100000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5398 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_ruleXClosure5420 = new BitSet(new long[]{0x00E51087001F80F0L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5457 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXClosure5469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5571 = new BitSet(new long[]{0x00E61087001F80F2L});
    public static final BitSet FOLLOW_49_in_ruleXExpressionInClosure5584 = new BitSet(new long[]{0x00E41087001F80F2L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5742 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_ruleXShortClosure5755 = new BitSet(new long[]{0x0400100000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5776 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_ruleXShortClosure5798 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXParenthesizedExpression5917 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5939 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXParenthesizedExpression5950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXIfExpression6042 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXIfExpression6054 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6075 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXIfExpression6087 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6108 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXIfExpression6129 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6247 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_52_in_ruleXCasePart6261 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6282 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXCasePart6296 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock6418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration6480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration6490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXVariableDeclaration6543 = new BitSet(new long[]{0x0400100000000080L});
    public static final BitSet FOLLOW_54_in_ruleXVariableDeclaration6574 = new BitSet(new long[]{0x0400100000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration6622 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration6643 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration6672 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleXVariableDeclaration6686 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration6707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter6745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter6755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter6801 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter6823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter6859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter6869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter6915 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter6936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall6972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall6982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7039 = new BitSet(new long[]{0x0080000100000080L});
    public static final BitSet FOLLOW_32_in_ruleXFeatureCall7053 = new BitSet(new long[]{0x0C00100000000080L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7074 = new BitSet(new long[]{0x0000080080000000L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall7087 = new BitSet(new long[]{0x0C00100000000080L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7108 = new BitSet(new long[]{0x0000080080000000L});
    public static final BitSet FOLLOW_31_in_ruleXFeatureCall7122 = new BitSet(new long[]{0x0080000100000080L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7147 = new BitSet(new long[]{0x0000500000000002L});
    public static final BitSet FOLLOW_44_in_ruleXFeatureCall7181 = new BitSet(new long[]{0x0484B087001F80F0L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7266 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7294 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall7307 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7328 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFeatureCall7345 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper7418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper7429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper7476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleIdOrSuper7500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier7541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier7552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier7599 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleStaticQualifier7617 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral7662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral7672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral7723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause7772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause7782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXCatchClause7827 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXCatchClause7840 = new BitSet(new long[]{0x0400100000000080L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause7861 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXCatchClause7873 = new BitSet(new long[]{0x00841087001F80F0L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause7894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName7931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName7942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName7989 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleQualifiedName8017 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName8040 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference8087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference8097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference8145 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleJvmTypeReference8183 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleJvmTypeReference8195 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference8227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef8262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef8272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXFunctionTypeRef8310 = new BitSet(new long[]{0x0400300000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef8332 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFunctionTypeRef8345 = new BitSet(new long[]{0x0400100000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef8366 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFunctionTypeRef8382 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXFunctionTypeRef8396 = new BitSet(new long[]{0x0400100000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef8417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference8453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference8463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference8511 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleJvmParameterizedTypeReference8532 = new BitSet(new long[]{0x0C00100000000080L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference8554 = new BitSet(new long[]{0x0000080080000000L});
    public static final BitSet FOLLOW_43_in_ruleJvmParameterizedTypeReference8567 = new BitSet(new long[]{0x0C00100000000080L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference8588 = new BitSet(new long[]{0x0000080080000000L});
    public static final BitSet FOLLOW_31_in_ruleJvmParameterizedTypeReference8602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference8640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference8650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference8697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference8724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference8759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference8769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleJvmWildcardTypeReference8815 = new BitSet(new long[]{0x1080000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference8837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference8864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound8902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound8912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleJvmUpperBound8949 = new BitSet(new long[]{0x0400100000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound8970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded9006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded9016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleJvmUpperBoundAnded9053 = new BitSet(new long[]{0x0400100000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded9074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound9110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound9120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleJvmLowerBound9157 = new BitSet(new long[]{0x0400100000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound9178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID9217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID9228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID9267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred1_InternalEL416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred2_InternalEL587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred3_InternalEL2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred4_InternalEL2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred5_InternalEL2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred6_InternalEL3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred7_InternalEL3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred8_InternalEL3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred9_InternalEL4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred10_InternalEL4585 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred10_InternalEL4594 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred10_InternalEL4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred11_InternalEL4703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred11_InternalEL4717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred11_InternalEL4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred12_InternalEL4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred13_InternalEL5016 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred13_InternalEL5023 = new BitSet(new long[]{0x0400100000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred13_InternalEL5030 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred13_InternalEL5044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred14_InternalEL5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalEL5310 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred16_InternalEL5317 = new BitSet(new long[]{0x0400100000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalEL5324 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred16_InternalEL5338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred18_InternalEL6121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred19_InternalEL6592 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalEL6601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred20_InternalEL7163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred21_InternalEL7215 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred21_InternalEL7222 = new BitSet(new long[]{0x0400100000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred21_InternalEL7229 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred21_InternalEL7243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred22_InternalEL7363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred24_InternalEL8008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred25_InternalEL8160 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_synpred25_InternalEL8164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred26_InternalEL8524 = new BitSet(new long[]{0x0000000000000002L});

}