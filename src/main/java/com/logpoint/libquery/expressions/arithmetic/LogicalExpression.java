package com.logpoint.libquery.expressions.arithmetic;

import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

import com.logpoint.libquery.exceptions.InvalidOperationException;
import com.logpoint.libquery.exceptions.ParseException;
import com.logpoint.libquery.expressions.Expression;
import com.sun.org.apache.xpath.internal.operations.Bool;

public class LogicalExpression extends BinaryExpression implements Expression {

    @Override
    public Object evaluateExpression() throws InvalidOperationException {
        boolean result = false;
        List<Object> values = getExpressions().stream().map(expression -> {
            try {
                return expression.evaluateExpression();
            } catch (InvalidOperationException ex) {
                ex.printStackTrace();
            }
            return null;
        }).collect(Collectors.toList());

        Object leftOperand = values.get(0);
        if (values.size() == 1) {
            return leftOperand;
        }

        Object rightOperand = values.get(1);

        if (!(leftOperand instanceof Boolean) || !(rightOperand instanceof Boolean)) {
            throw new InvalidOperationException("Logical operation can only be performed between boolean values.");
        }

        switch (getOperator()) {
            case "&&":
                result = (boolean) leftOperand && (boolean) rightOperand;
                break;

            case "||":
                result = (boolean) leftOperand || (boolean) rightOperand;
                break;

            default:
                result = false;
        }
        return result;
    }
}
