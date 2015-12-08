package cz.fit.dpo.cbi;

import cz.fit.dpo.cbi.arithmetic.ArithmeticExpression;

public class ArithmeticExpressionBuildDirector {

	public ArithmeticExpression constructExpressionFromRPN(String expString) {
		ArithmeticExpressionBuilder builder = new ConcreteRPNArithmeticExpressionBuilder();

		for (String token : expString.split(" ")) {
			switch (token) {
			case "+":
				builder.operationPlus();
				break;
			case "-":
				builder.operationMinus();
				break;
			default:
				builder.Number(Integer.parseInt(token));
				break;
			}
		}

		return builder.getResult();
	}
}
