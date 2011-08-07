package ch.vorburger.elang.engine.tests;

import org.junit.Ignore;
import org.junit.Test;

public class InAndLikeTest extends AbstractScriptTestBase {

	// @Test
	// TODO public void testDateIN() throws Exception {
	//	checkBooleanExpressionScript("15.06.2008 IN(14.06.2008,15.06.2008)", true);
	//	checkBooleanExpressionScript("28.06.2008 IN(14.06.2008,15.06.2008)", false);

	@Test
	@Ignore // TODO The syntax in the ELangDsl.xtext for LIKE is there, now need to write a Node type for it etc.
	public void testStringLIKE() throws Exception {
		checkBooleanExpressionScript("\"Hello\" LIKE \"H*\"", true);
		checkBooleanExpressionScript("\"Hello\" LIKE \"H?l?o\"", true);
		checkBooleanExpressionScript("\"Hello\" LIKE \"H[a-z]+\"", true);
		
		checkBooleanExpressionScript("\"Hello\" LIKE \"asdoivanwe9ecuwn\"", false);
		checkBooleanExpressionScript("\"Hello\" LIKE \"K*\"", false);
	}


	@Test
	@Ignore // TODO The syntax in the ELangDsl.xtext for IN is there, now need to write a Node type for it etc.
	public void testNumericIN() throws Exception {
		checkBooleanExpressionScript("1 IN (1  ,\t2\n3)", true);
		checkBooleanExpressionScript("2 IN (1  ,\t2\n3)", true);
		checkBooleanExpressionScript("3 IN (1  ,\t2\n3)", true);
		
		checkBooleanExpressionScript("27 IN (1  ,\t2\n3)", true);
	}

	@Test
	@Ignore // TODO The syntax in the ELangDsl.xtext for IN is there, now need to write a Node type for it etc.
	public void testStringIN() throws Exception {
		checkBooleanExpressionScript("\"USD\" IN(\"USD\",\"DEM\",\"GBP\")", true);
		checkBooleanExpressionScript("\"DEM\" IN(\"USD\",\"DEM\",\"GBP\")", true);
		checkBooleanExpressionScript("\"GBP\" IN(\"USD\",\"DEM\",\"GBP\")", true);
		
		checkBooleanExpressionScript("\"Hello!\" IN(\"USD\",\"DEM\",\"GBP\")", false);
	}


}
