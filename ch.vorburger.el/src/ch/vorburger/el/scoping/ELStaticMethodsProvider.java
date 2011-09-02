package ch.vorburger.el.scoping;

import java.util.Collections;

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticMethodsFeatureForTypeProvider;

import com.google.common.collect.Iterables;

public class ELStaticMethodsProvider extends StaticMethodsFeatureForTypeProvider {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	protected Iterable getVisibleTypesContainingStaticMethods(JvmTypeReference reference) {
		Iterable resultFromSuper = super.getVisibleTypesContainingStaticMethods(reference);
		if (reference != null && reference.getType() != null
				&& "java.math.BigDecimal".equals(reference.getType().getIdentifier())) {
			return Iterables.concat(
					Collections.singletonList("ch.vorburger.el.lib.DecimalExtensions"),
					resultFromSuper);
		}
		if (reference != null && reference.getType() != null
				&& "java.util.GregorianCalendar".equals(reference.getType().getIdentifier())) {
			return Iterables.concat(
					Collections.singletonList("ch.vorburger.el.lib.DateExtensions"),
					resultFromSuper);
		}
		return resultFromSuper;
	}
}