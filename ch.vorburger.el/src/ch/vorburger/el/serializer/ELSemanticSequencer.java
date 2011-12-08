package ch.vorburger.el.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.XMemberFeatureCall;

@SuppressWarnings("restriction")
public class ELSemanticSequencer extends AbstractELSemanticSequencer {

	@Override
	protected void sequence_XMemberFeatureCall(EObject context,
			XMemberFeatureCall semanticObject) {
		return;
	}
}
