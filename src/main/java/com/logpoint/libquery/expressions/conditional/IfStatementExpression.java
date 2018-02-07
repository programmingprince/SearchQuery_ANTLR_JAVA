package com.logpoint.libquery.expressions.conditional;

import com.logpoint.libquery.exceptions.InvalidOperationException;
import com.logpoint.libquery.expressions.Expression;

public class IfStatementExpression implements Expression {

    Expression condition;
    Expression trueValue;
    Expression falseValue;

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Expression getTrueValue() {
        return trueValue;
    }

    public void setTrueValue(Expression trueValue) {
        this.trueValue = trueValue;
    }

    public Expression getFalseValue() {
        return falseValue;
    }

    public void setFalseValue(Expression falseValue) {
        this.falseValue = falseValue;
    }

    @Override
    public Object evaluateExpression() throws InvalidOperationException {
        if ((boolean) getCondition().evaluateExpression()) {
            return true;
        }
        return false;
    }
}
