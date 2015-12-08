package cz.fit.dpo.cbi;

import cz.fit.dpo.cbi.arithmetic.ArithmeticExpression;

public class ArithmeticExpressionBuildDirector {

	public ArithmeticExpression constructExpressionFromRPN(String expString) {
		ArithmeticExpressionBuilder builder = new ConcreteRPNArithmeticExpressionBuilder();

		for (String token : expString.split(" ")) {
			switch (token) {
			case "-":
				builder.operationMinus();
				break;
			case "+":
				builder.operationPlus();
				break;
			default:
				builder.Number(Integer.parseInt(token));
				break;
			}
		}

		return builder.getResult();
	}
}
