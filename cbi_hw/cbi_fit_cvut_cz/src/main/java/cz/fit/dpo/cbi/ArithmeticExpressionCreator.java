package cz.fit.dpo.cbi;

import cz.fit.dpo.cbi.arithmetic.ArithmeticExpression;

public class ArithmeticExpressionCreator {

    /**
     * Creates any expression from the RPN input.
     *
     * @param input in Reverse Polish Notation
     * @return {@link ArithmeticExpression} equivalent of the RPN input.
     * @see http://en.wikipedia.org/wiki/Reverse_Polish_notation
     */
    public ArithmeticExpression createExpressionFromRPN(String input) {
		ArithmeticExpressionBuildDirector buildDirector = //
				new ArithmeticExpressionBuildDirector();
        return buildDirector.constructExpressionFromRPN(input);
    }
}
