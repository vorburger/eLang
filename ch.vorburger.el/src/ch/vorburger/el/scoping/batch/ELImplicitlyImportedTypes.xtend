package ch.vorburger.el.scoping.batch

import ch.vorburger.el.lib.DateExtensions
import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedFeatures

class ELImplicitlyImportedTypes extends ImplicitlyImportedFeatures {
	
	override protected getExtensionClasses() {
		newArrayList(
			ArrayExtensions,
			BigDecimalExtensions,
			BigIntegerExtensions,
			BooleanExtensions,
			ByteExtensions,
			CharacterExtensions,
			CollectionExtensions,
			ComparableExtensions,
			DateExtensions,
			DoubleExtensions,
			FloatExtensions,
			FunctionExtensions,
			IntegerExtensions,
			IterableExtensions,
			IteratorExtensions,
			ListExtensions,
			LongExtensions,
			MapExtensions,
			ObjectExtensions,
			ProcedureExtensions,
			ShortExtensions,
			StringExtensions)
	}
	
}