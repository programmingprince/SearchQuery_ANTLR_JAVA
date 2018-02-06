package com.logpoint.libquery.expressions.arithmetic;

import com.logpoint.libquery.expressions.Expression;

import java.util.List;

public class BinaryExpression {
    List<Expression> expressions;
    String operator;

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
