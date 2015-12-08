package cz.fit.dpo.cbi.arithmetic;

import cz.fit.dpo.cbi.arithmetic.elements.AddOperation;
import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;

/**
 * Represents + operation
 */

// COMPOSITE

public class AddOperator extends BinaryOperator {

	public AddOperator(ArithmeticExpression fOp, ArithmeticExpression sOp) {
		super(fOp, sOp);
	}

	@Override
	public Integer evaluate() {
		return getFirstOperand().evaluate() + getSecondOperand().evaluate();
	}

	@Override
	public ExpressionElement getExpressionElement() {
		return new AddOperation();
	}
}
