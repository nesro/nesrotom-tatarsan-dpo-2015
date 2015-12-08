package cz.fit.dpo.cbi.arithmetic;

import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;
import cz.fit.dpo.cbi.arithmetic.elements.SubstractOperation;

/**
 * Represents - operation
 */

// COMPOSITE

public class SubstractOperator extends BinaryOperator {

	public SubstractOperator(ArithmeticExpression fOp, ArithmeticExpression sOp) {
		super(fOp, sOp);
	}

	@Override
	public Integer evaluate() {
		return getFirstOperand().evaluate() - getSecondOperand().evaluate();
	}

	@Override
	public ExpressionElement getExpressionElement() {
		return new SubstractOperation();
	}
}
