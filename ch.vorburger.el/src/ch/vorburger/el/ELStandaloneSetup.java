
package ch.vorburger.el;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ELStandaloneSetup extends ELStandaloneSetupGenerated{

	public static void doSetup() {
		new ELStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

