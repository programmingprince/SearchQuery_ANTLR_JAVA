package com.logpoint.libquery.expressions.arithmetic;

import com.logpoint.libquery.expressions.Expression;

public class AtomicExpression extends UnaryExpression implements Expression {

    @Override
    public Object evaluateExpression() {
        return getValue();
    }
}
