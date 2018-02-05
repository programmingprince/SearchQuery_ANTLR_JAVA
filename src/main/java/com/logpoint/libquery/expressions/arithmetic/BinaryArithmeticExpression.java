package com.logpoint.libquery.expressions.arithmetic;

import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

import com.logpoint.libquery.expressions.Expression;

public class BinaryArithmeticExpression implements Expression<Double> {

	List<Expression<Double>> expressions;
	char operator;

	public List<Expression<Double>> getExpressions() {
		return expressions;
	}

	public void setExpressions(List<Expression<Double>> expressions) {
		this.expressions = expressions;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}

	public char getOperator() {
		return operator;
	}

	@Override
	public Double evaluateExpression() {
		double result;
		switch (getOperator()) {
		case '+':
			result = add();
			break;

		case '-':
			result = substract();
			break;

		case '*':
			result = multiply();
			break;

		case '/':
			result = divide();
			break;

		case '%':
			result = modulus();
			break;

		case '^':
			result = power();
			break;

		default:
			result = getExpressions().get(0).evaluateExpression();
		}
		return result;
	}

	public double add() {
		return getExpressions().stream().mapToDouble(expression -> expression.evaluateExpression()).sum();
	}

	public double substract() {
		List<Double> values = getExpressions().stream().map(expression -> expression.evaluateExpression())
				.collect(Collectors.toList());
		double result = values.get(0);
		ListIterator<Double> listIterator = values.subList(1, values.size()).listIterator();
		while (listIterator.hasNext()) {
			result -= listIterator.next();
		}

		return result;
	}

	public double multiply() {
		return getExpressions().stream().mapToDouble(expression -> expression.evaluateExpression()).reduce(1.0,
				(leftOperand, rightOperand) -> leftOperand * rightOperand);
	}

	public double divide() {
		List<Double> values = getExpressions().stream().map(expression -> expression.evaluateExpression())
				.collect(Collectors.toList());
		double result = values.get(0);
		ListIterator<Double> listIterator = values.subList(1, values.size()).listIterator();
		while (listIterator.hasNext()) {
			result /= listIterator.next();
		}

		return result;
	}

	public double modulus() {
		List<Double> values = getExpressions().stream().map(expression -> expression.evaluateExpression())
				.collect(Collectors.toList());
		double result = values.get(0);
		ListIterator<Double> listIterator = values.subList(1, values.size()).listIterator();
		while (listIterator.hasNext()) {
			result %= listIterator.next();
		}

		return result;
	}

	public double power() {
		List<Double> values = getExpressions().stream().map(expression -> expression.evaluateExpression())
				.collect(Collectors.toList());
		double result = values.get(0);
		ListIterator<Double> listIterator = values.subList(1, values.size()).listIterator();
		while (listIterator.hasNext()) {
			result = Math.pow(result, listIterator.next());
		}

		return result;
	}
}
