package ch.vorburger.el;

import com.google.inject.Injector;

public class ELStandaloneSetup extends ELStandaloneSetupGenerated {

	private static Injector injector;

	public static void doSetup() {
		if (injector == null) {
			injector = new ELStandaloneSetup().createInjectorAndDoEMFRegistration();
		}
	}

	public static synchronized Injector getInjector() {
		if (injector == null) {
			doSetup();
		}
		return injector;
	}
}
