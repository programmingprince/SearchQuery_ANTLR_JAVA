package com.logpoint.libquery.expressions.conditional;

import com.logpoint.libquery.exceptions.InvalidOperationException;
import com.logpoint.libquery.expressions.Expression;

import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class CaseStatementExpression implements Expression {

    List<Expression> expressions;
    List<Expression> values;
    Expression defaultValue;

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public List<Expression> getValues() {
        return values;
    }

    public void setValues(List<Expression> values) {
        this.values = values;
    }

    public Expression getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Expression defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public Object evaluateExpression() throws InvalidOperationException {
        List<Object> objectList = expressions.stream().map(expression -> {
            try {
                return expression.evaluateExpression();
            } catch (InvalidOperationException ex) {
                ex.printStackTrace();
            }
            return null;
        }).collect(Collectors.toList());

        ListIterator<Object> listIterator = objectList.listIterator();
        while (listIterator.hasNext()) {
            Object obj = listIterator.next();
            if ((boolean) obj) {
                int index = objectList.indexOf(obj);
                return values.get(index).evaluateExpression();
            }
        }

        return defaultValue.evaluateExpression();
    }
}
