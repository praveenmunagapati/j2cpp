package me.pixodro.j2cpp.core.info;

import org.eclipse.jdt.core.dom.VariableDeclarationStatement;

/**
 * Created with IntelliJ IDEA.
 * User: bquenin
 * Date: 7/9/12
 * Time: 10:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class VariableDeclarationStatementInfo extends AbstractVariableDeclarationInfo {
  public VariableDeclarationStatementInfo(final VariableDeclarationStatement variableDeclarationStatement, final CompilationUnitInfo compilationUnitInfo) {
    super(variableDeclarationStatement, compilationUnitInfo);
  }
}
