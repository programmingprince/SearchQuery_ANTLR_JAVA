package com.logpoint.libquery.expressions.arithmetic;

import com.logpoint.libquery.expressions.Expression;

public class UnsignedUnaryExpression extends UnaryArithmeticExpression implements Expression<Double> {

	@Override
	public Double evaluateExpression() {
		return getValue();
	}
}
