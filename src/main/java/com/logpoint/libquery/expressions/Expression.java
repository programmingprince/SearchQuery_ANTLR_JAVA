package com.logpoint.libquery.expressions;

import com.logpoint.libquery.exceptions.InvalidOperationException;

public interface Expression {
    public Object evaluateExpression() throws InvalidOperationException;
}
