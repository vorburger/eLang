package ch.vorburger.el.ui.contentassist;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.xtext.ui.AbstractTypesProposalProvider;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalFactory;

import com.google.inject.Inject;

public class ELTypeProposalProvider extends AbstractTypesProposalProvider {

	@Inject
	IScopeProvider scopeProvider;
	
	public void createTypeProposals(ICompletionProposalFactory proposalFactory,
			ContentAssistContext context, EReference typeReference,
			Filter filter, IValueConverter<String> valueConverter,
			ICompletionProposalAcceptor acceptor) {
		IScope scope = scopeProvider.getScope(context.getCurrentModel(), typeReference);
		for(IEObjectDescription desc : scope.getAllElements()) {
			String domainName = desc.getQualifiedName().getFirstSegment();
			String typeName = desc.getName().getLastSegment();
			StyledString displayString = new StyledString(typeName + " (" + domainName + ")");
			if(!context.getPrefix().contains("::")) {
				context = context.copy().setPrefix(domainName + "::" + context.getPrefix()).toContext();
			}
			ICompletionProposal proposal = proposalFactory.createCompletionProposal(domainName + "::" + typeName, displayString, null, context);
			if(proposal!=null) {
				acceptor.accept(proposal);
			}
		}
	}

	public void createSubTypeProposals(JvmType superType,
			ICompletionProposalFactory proposalFactory,
			ContentAssistContext context, EReference typeReference,
			Filter filter, IValueConverter<String> valueConverter,
			ICompletionProposalAcceptor acceptor) {
	}

}
