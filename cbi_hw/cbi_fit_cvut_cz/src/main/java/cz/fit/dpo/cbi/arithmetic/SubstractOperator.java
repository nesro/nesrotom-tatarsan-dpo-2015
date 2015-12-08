package cz.fit.dpo.cbi.arithmetic;

import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;
import java.util.Iterator;

/**
 * Represents - operation
 */
public class SubstractOperator extends BinaryOperator {
    
    public SubstractOperator(ArithmeticExpression firstOperand, ArithmeticExpression secondOperand) {
        super(firstOperand, secondOperand);
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
