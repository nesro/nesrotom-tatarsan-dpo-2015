package cz.fit.dpo.cbi;

import cz.fit.dpo.cbi.arithmetic.ArithmeticExpression;
import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;

import java.util.Iterator;

/**
 * Printer for {@link ArithmeticExpression}s. It can print inOrder notation (3 +
 * 1) or postOrder notation (3 1 +).
 * <p>
 * PostOrder is RPN (Reverse Polish Notation) in fact. See wiki for more
 * information.
 */
public class ArithmeticExpressionPrinter {
	private ArithmeticExpression expression;

	public ArithmeticExpressionPrinter(ArithmeticExpression expression) {
		this.expression = expression;
	}

	/**
	 * Print an expression in classical notation, e.g. (3+1). The "(" and ")" is
	 * used to preserve priorities.
	 *
	 * @return String in classical "inOrder" format.
	 */
	public String printInOrder() {
		Iterator<ExpressionElement> it = expression.getInOrderIterator();
		StringBuilder strb = new StringBuilder("");
		
		while (it.hasNext()) {
			strb.append(it.next().stringValue());
		}
		
		return strb.toString();
	}

	/**
	 * Print an expression in RPN notation, e.g. 3 1 +. Please note, the "(" and
	 * ")" are no longer necessary, because RPN does not need them.
	 *
	 * @return string in "postOrder" (RPN) format.
	 */
	public String printPostOrder() {
		Iterator<ExpressionElement> it = expression.getPostOrderIterator();
		StringBuilder strb = new StringBuilder("");
		
		while (it.hasNext()) {
			strb.append(it.next().stringValue());
			strb.append(" ");
		}
		
		/* delete the last space */
		if (strb.length() > 0) {
			strb.deleteCharAt(strb.length() - 1);
		}
		
		return strb.toString();
	}

}
