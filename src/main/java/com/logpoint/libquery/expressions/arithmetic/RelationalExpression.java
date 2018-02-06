package com.logpoint.libquery.expressions.arithmetic;

import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

import com.logpoint.libquery.exceptions.InvalidOperationException;
import com.logpoint.libquery.exceptions.ParseException;
import com.logpoint.libquery.expressions.Expression;
import org.omg.PortableInterceptor.INACTIVE;

import javax.sound.midi.SysexMessage;

public class RelationalExpression extends BinaryExpression implements Expression {

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

        System.out.println(getOperator());
        System.out.println(leftOperand.getClass());
        System.out.println(rightOperand.getClass());

        if (!leftOperand.getClass().equals(rightOperand.getClass())) {
            throw new InvalidOperationException(getOperator() + " operator is only valid between similar operands.");
        }

        if (!(leftOperand instanceof Double) && !(leftOperand instanceof Boolean) && !(leftOperand instanceof String)) {
            throw new InvalidOperationException(getOperator() + " operator is not valid for given values.");
        }

        if (leftOperand instanceof Boolean && !getOperator().equals("==") && !getOperator().equals("!=")) {
            throw new InvalidOperationException(getOperator() + " operator is not valid for boolean values.");
        }

        switch (getOperator()) {
            case "==":
                if (leftOperand instanceof Boolean) {
                    result = leftOperand == rightOperand;
                } else if(leftOperand instanceof Double) {
                    result = ((Double) leftOperand).compareTo((Double)rightOperand) == 0;
                } else {
                    result = leftOperand.toString().equals(rightOperand.toString());
                }

                break;

            case "!=":
                if (leftOperand instanceof Boolean) {
                    result = leftOperand != rightOperand;
                }  else if(leftOperand instanceof Double) {
                    result = ((Double) leftOperand).compareTo((Double)rightOperand) != 0;
                } else {
                    result = !leftOperand.toString().equals(rightOperand.toString());
                }
                break;

            case ">":
                if (leftOperand instanceof Double) {
                    result = (double) leftOperand > (double) rightOperand;
                } else {
                    result = leftOperand.toString().compareTo(rightOperand.toString()) > 0;
                }
                break;

            case "<":
                if (leftOperand instanceof Double) {
                    result = (double) leftOperand < (double) rightOperand;
                } else {
                    result = leftOperand.toString().compareTo(rightOperand.toString()) < 0;
                }
                break;

            case ">=":
                if (leftOperand instanceof Double) {
                    result = (double) leftOperand >= (double) rightOperand;
                } else {
                    result = leftOperand.toString().compareTo(rightOperand.toString()) >= 0;
                }
                break;

            case "<=":
                if (leftOperand instanceof Double) {
                    result = (double) leftOperand <= (double) rightOperand;
                } else {
                    result = leftOperand.toString().compareTo(rightOperand.toString()) <= 0;
                }
                break;

            default:
                result = false;
        }
        return result;
    }
}
