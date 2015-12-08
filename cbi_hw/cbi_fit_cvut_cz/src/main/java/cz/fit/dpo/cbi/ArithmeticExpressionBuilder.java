package cz.fit.dpo.cbi;

import cz.fit.dpo.cbi.arithmetic.ArithmeticExpression;

// BUILDER

public interface ArithmeticExpressionBuilder {
    public void operationPlus();
    public void operationMinus();
    public void Number(int value);
    public ArithmeticExpression getResult();
}
