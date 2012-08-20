package ch.vorburger.el.ui.hovering;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider;
import org.eclipse.xtext.xbase.compiler.DocumentationAdapter;

public class ELEObjectDocumentationProvider extends MultiLineCommentDocumentationProvider {

	@Override
	public String getDocumentation(EObject o) {
		if (o == null) return null;
		if (o instanceof JvmIdentifiableElement) {
			DocumentationAdapter adapter = (DocumentationAdapter) EcoreUtil.getAdapter(o.eAdapters(), DocumentationAdapter.class);
			if (adapter != null)
				return adapter.getDocumentation();
		}
		return super.getDocumentation(o);
	}

}
