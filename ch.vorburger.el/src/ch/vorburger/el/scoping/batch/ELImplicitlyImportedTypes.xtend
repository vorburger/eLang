package ch.vorburger.el.scoping.batch

import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedTypes
import ch.vorburger.el.lib.DateExtensions

class ELImplicitlyImportedTypes extends ImplicitlyImportedTypes {
	
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