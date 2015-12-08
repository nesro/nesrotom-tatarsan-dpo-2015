package cz.fit.dpo.cbi.arithmetic.iterator;

import cz.fit.dpo.cbi.arithmetic.BinaryOperator;
import cz.fit.dpo.cbi.arithmetic.NumericOperand;
import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;

import java.util.ArrayList;
import java.util.Iterator;

public class PostOrderIterator implements Iterator<ExpressionElement> {
	private ArrayList<ExpressionElement> elements;
	private int position;

	public PostOrderIterator(BinaryOperator expression) {
		elements = new ArrayList<ExpressionElement>();
		position = 0;

		/* left subtree */
		Iterator<ExpressionElement> firstOperandIterator = expression.getFirstOperand().getPostOrderIterator();
		while (firstOperandIterator.hasNext()) {
			elements.add(firstOperandIterator.next());
		}

		/* right subtree */
		Iterator<ExpressionElement> secondOperandIterator = expression.getSecondOperand().getPostOrderIterator();
		while (secondOperandIterator.hasNext()) {
			elements.add(secondOperandIterator.next());
		}

		/* root */
		elements.add(expression.getExpressionElement());
	}

	public PostOrderIterator(NumericOperand expression) {
		elements = new ArrayList<ExpressionElement>();

		position = 0;
		elements.add(expression.getExpressionElement());
	}

	@Override
	public boolean hasNext() {
		return (position < elements.size());
	}

	@Override
	public ExpressionElement next() {
		return elements.get(position++);
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
