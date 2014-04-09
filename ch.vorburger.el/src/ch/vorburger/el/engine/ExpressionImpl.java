package ch.vorburger.el.engine;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.output.FakeTreeAppendable;

import ch.vorburger.el.generator.ELCompiler;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class ExpressionImpl implements Expression {

	private final static Logger LOGGER = Logger.getLogger(ExpressionImpl.class);

	@Inject protected ELCompiler compiler;
	
	protected XExpression xExpression;

	
	// TODO This is a mess/short-term hack... must improve @see http://rd.oams.com/browse/DS-5853
	public void setELCompiler(ELCompiler compiler) {
		this.compiler = compiler;
	}

	/* package-local */
	 void setXExpression(XExpression xExpression) {
		this.xExpression = xExpression;
	}

	/* package-local */
	XExpression getXExpression() {
		return xExpression;
	}
	
	@Override
	public String generateJavaCode(Class<?> expectedType) {
		ImportManager importManager = new ImportManager(false);
		FakeTreeAppendable appendable = new FakeTreeAppendable(importManager);
		return compiler.compileAsJavaExpression(getXExpression(), appendable, expectedType).toString();
	}
	
	@Override
	public void dispose() {
		try {
			xExpression.eResource().delete(null);
		} catch (IOException e) {
			LOGGER.warn("XExpression.eResource.delete failed", e);
			// If we cannot delete, can we at least unload?
			xExpression.eResource().unload();
		}
	}
	
}
