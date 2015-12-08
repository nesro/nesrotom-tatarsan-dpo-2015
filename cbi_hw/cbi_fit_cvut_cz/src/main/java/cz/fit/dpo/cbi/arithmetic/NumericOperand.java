package cz.fit.dpo.cbi.arithmetic;

import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;
import cz.fit.dpo.cbi.arithmetic.elements.Number;
import cz.fit.dpo.cbi.arithmetic.iterator.InOrderIterator;
import cz.fit.dpo.cbi.arithmetic.iterator.PostOrderIterator;

import java.util.Iterator;

/**
 * Represents number in the arithmetic expression
 */

public class NumericOperand implements ArithmeticExpression {

    private Integer value;

    public NumericOperand(Integer v) {
        this.value = v;
    }

    @Override
    public Integer evaluate() {
        return value;
    }

    @Override
    public Iterator<ExpressionElement> getInOrderIterator() {
        return new InOrderIterator(this);
    }

    @Override
    public Iterator<ExpressionElement> getPostOrderIterator() {
        return new PostOrderIterator(this);
    }

    @Override
    public ExpressionElement getExpressionElement() {
        return new Number(value);
    }
}
