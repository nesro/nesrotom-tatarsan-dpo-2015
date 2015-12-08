package cz.fit.dpo.cbi.arithmetic;

import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;
import cz.fit.dpo.cbi.arithmetic.iterator.InOrderIterator;
import cz.fit.dpo.cbi.arithmetic.iterator.PostOrderIterator;
import java.util.Iterator;

/**
 * Represents number in the arithmetic expression
 */
public class NumericOperand extends ArithmeticExpression {

    private Integer value;

    public NumericOperand(Integer value) {
        this.value = value;
    }

    @Override
    public Integer evaluate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterator<ExpressionElement> getInOrderIterator() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Iterator<ExpressionElement> getPostOrderIterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
