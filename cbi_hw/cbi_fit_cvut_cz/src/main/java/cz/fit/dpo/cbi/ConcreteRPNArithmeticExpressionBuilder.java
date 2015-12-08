package cz.fit.dpo.cbi;

import cz.fit.dpo.cbi.arithmetic.AddOperator;
import cz.fit.dpo.cbi.arithmetic.ArithmeticExpression;
import cz.fit.dpo.cbi.arithmetic.NumericOperand;
import cz.fit.dpo.cbi.arithmetic.SubstractOperator;

import java.util.Stack;

public class ConcreteRPNArithmeticExpressionBuilder //
		implements ArithmeticExpressionBuilder {

	Stack<ArithmeticExpression> stack;

	public ConcreteRPNArithmeticExpressionBuilder() {
		stack = new Stack<ArithmeticExpression>();
	}

	public void operationPlus() {
		ArithmeticExpression secondOp = stack.pop();
		ArithmeticExpression firstOp = stack.pop();
		stack.push(new AddOperator(firstOp, secondOp));
	}

	public void operationMinus() {
		ArithmeticExpression secondOp = stack.pop();
		ArithmeticExpression firstOp = stack.pop();
		stack.push(new SubstractOperator(firstOp, secondOp));
	}

	public void Number(int v) {
		stack.push(new NumericOperand(v));
	}

	@Override
	public ArithmeticExpression getResult() {
		return stack.pop();
	}
}
