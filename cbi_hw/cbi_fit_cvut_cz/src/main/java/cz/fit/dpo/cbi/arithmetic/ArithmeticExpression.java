package cz.fit.dpo.cbi.arithmetic;

import java.util.Iterator;

import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;

public abstract class ArithmeticExpression {

    public abstract Integer evaluate();
    
    public abstract Iterator<ExpressionElement> getInOrderIterator();

    public abstract Iterator<ExpressionElement> getPostOrderIterator();
}
