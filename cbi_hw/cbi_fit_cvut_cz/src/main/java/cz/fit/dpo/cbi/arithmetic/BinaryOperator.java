package cz.fit.dpo.cbi.arithmetic;

import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;
import cz.fit.dpo.cbi.arithmetic.iterator.InOrderIterator;
import cz.fit.dpo.cbi.arithmetic.iterator.PostOrderIterator;

import java.util.Iterator;

/**
 * Represents the Binary operations like + - etc.
 */

public abstract class BinaryOperator implements ArithmeticExpression {

	private ArithmeticExpression firstOperand;
	private ArithmeticExpression secondOperand;

	public BinaryOperator(ArithmeticExpression fOp, ArithmeticExpression sOp) {
		this.firstOperand = fOp;
		this.secondOperand = sOp;
	}

	public ArithmeticExpression getFirstOperand() {
		return firstOperand;
	}

	public ArithmeticExpression getSecondOperand() {
		return secondOperand;
	}

	@Override
	public Iterator<ExpressionElement> getInOrderIterator() {
		return new InOrderIterator(this);
	}

	@Override
	public Iterator<ExpressionElement> getPostOrderIterator() {
		return new PostOrderIterator(this);
	}
}
