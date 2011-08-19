package ch.vorburger.el.engine.tests;

import ch.vorburger.el.ELInjectorProvider;
import ch.vorburger.el.ELRuntimeModule;
import ch.vorburger.el.ELStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class InjectorProviderCustom extends ELInjectorProvider {
	
	private Injector injector = new ELStandaloneSetup() {
		@Override
		public Injector createInjector() {
			return Guice.createInjector(new ELRuntimeModule() {
				@Override
				public ClassLoader bindClassLoaderToInstance() {
					return InjectorProviderCustom.class.getClassLoader();
				}
			});
		}
	}.createInjectorAndDoEMFRegistration();;

	public Injector getInjector() {
		return injector;
	}
}
