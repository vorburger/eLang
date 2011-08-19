package ch.vorburger.el.scoping;

import java.util.Collections;

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticMethodsFeatureForTypeProvider;

import com.google.common.collect.Iterables;

public class ELStaticMethodsProvider extends
		StaticMethodsFeatureForTypeProvider {

	@Override
	  protected Iterable<String> getVisibleTypesContainingStaticMethods(JvmTypeReference reference) {
		Iterable<String> resultFromSuper = super.getVisibleTypesContainingStaticMethods(reference);
		if (reference != null && reference.getType() != null
	        && "java.math.BigDecimal"
	          .equals(reference.getType().getIdentifier())) {
	      return Iterables.concat(Collections.singletonList("ch.vorburger.el.lib.TypeExtensions"), resultFromSuper);
	    }
	    return resultFromSuper;
	  } 
}
