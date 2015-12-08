package cz.fit.dpo.cbi.arithmetic.iterator;

import cz.fit.dpo.cbi.arithmetic.BinaryOperator;
import cz.fit.dpo.cbi.arithmetic.NumericOperand;
import cz.fit.dpo.cbi.arithmetic.elements.CloseBracketOperation;
import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;
import cz.fit.dpo.cbi.arithmetic.elements.OpenBracketOperation;

import java.util.ArrayList;
import java.util.Iterator;

public class InOrderIterator implements Iterator<ExpressionElement> {
	private ArrayList<ExpressionElement> elements;
	private int position;

	public InOrderIterator(BinaryOperator expression) {
		elements = new ArrayList<ExpressionElement>();
		position = 0;

		// open bracket
		elements.add(new OpenBracketOperation());

		/* left subtree */
		Iterator<ExpressionElement> firstOperandIterator = expression.getFirstOperand().getInOrderIterator();
		while (firstOperandIterator.hasNext()) {
			elements.add(firstOperandIterator.next());
		}

		/* root */
		elements.add(expression.getExpressionElement());

		/* right subtree */
		Iterator<ExpressionElement> secondOperandIterator = expression.getSecondOperand().getInOrderIterator();
		while (secondOperandIterator.hasNext()) {
			elements.add(secondOperandIterator.next());
		}

		// close bracket
		elements.add(new CloseBracketOperation());
	}

	public InOrderIterator(NumericOperand expression) {
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
