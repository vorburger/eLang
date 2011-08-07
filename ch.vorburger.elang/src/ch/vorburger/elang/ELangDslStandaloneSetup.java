
package ch.vorburger.elang;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ELangDslStandaloneSetup extends ELangDslStandaloneSetupGenerated{

	public static void doSetup() {
		new ELangDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

