package ch.vorburger.el.generator;

import ch.vorburger.el.generator.ELCompiler;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ELGenerator implements IGenerator {
  @Inject
  private IQualifiedNameProvider nameProvider;
  
  @Inject
  private ELCompiler elCompiler;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
      EList<EObject> _contents = resource.getContents();
      Iterable<XExpression> _filter = IterableExtensions.<XExpression>filter(_contents, org.eclipse.xtext.xbase.XExpression.class);
      XExpression _head = IterableExtensions.<XExpression>head(_filter);
      final XExpression expr = _head;
      StringConcatenation _compile = this.compile(expr);
      fsa.generateFile("CompiledExpression.java", _compile);
  }
  
  public StringConcatenation compile(final XExpression e) {
    StringConcatenation _builder = new StringConcatenation();
    ImportManager _importManager = new ImportManager(true);
    final ImportManager importManager = _importManager;
    _builder.newLineIfNotEmpty();
    _builder.append("import ch.vorburger.el.engine.*;");
    _builder.newLine();
    _builder.append("import ch.vorburger.el.lib.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.xbase.lib.*;");
    _builder.newLine();
    _builder.append("import java.math.BigDecimal;");
    _builder.newLine();
    _builder.append("import java.util.GregorianCalendar;");
    _builder.newLine();
    _builder.append("import java.util.Calendar;");
    _builder.newLine();
    {
      List<String> _imports = importManager.getImports();
      for(final String i : _imports) {
        _builder.append("import ");
        _builder.append(i, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("public class CompiledExpression extends AbstractExpression {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Object evaluate() throws ExpressionExecutionException {");
    _builder.newLine();
    _builder.append("\t\t");
    String _compile = this.elCompiler.compile(e, importManager);
    _builder.append(_compile, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
