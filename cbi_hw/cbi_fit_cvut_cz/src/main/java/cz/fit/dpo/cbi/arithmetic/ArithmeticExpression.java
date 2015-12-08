package cz.fit.dpo.cbi.arithmetic;

import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;

import java.util.Iterator;

// COMPONENT

public interface ArithmeticExpression {

    public Integer evaluate();

    public Iterator<ExpressionElement> getInOrderIterator();

    public Iterator<ExpressionElement> getPostOrderIterator();

    public ExpressionElement getExpressionElement();
}
