package cz.fit.dpo.cbi;

import cz.fit.dpo.cbi.arithmetic.ArithmeticExpression;

public interface ArithmeticExpressionBuilder {
    public void operationPlus();
    public void operationMinus();
    public void Number(int value);
    public ArithmeticExpression getResult();
}
