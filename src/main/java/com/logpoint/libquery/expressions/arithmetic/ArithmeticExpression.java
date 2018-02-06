package com.logpoint.libquery.expressions.arithmetic;

import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

import com.logpoint.libquery.exceptions.InvalidOperationException;
import com.logpoint.libquery.exceptions.ParseException;
import com.logpoint.libquery.expressions.Expression;
import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.operations.Bool;

public class ArithmeticExpression extends BinaryExpression implements Expression {

    @Override
    public Object evaluateExpression() throws InvalidOperationException {
        List<Object> objectList = getExpressions().stream().map(expression -> {
            try {
                return expression.evaluateExpression();
            } catch (InvalidOperationException ex) {
                ex.printStackTrace();
            }
            return null;
        }).collect(Collectors.toList());

        Object leftOperand = objectList.get(0);
        if (objectList.size() == 1) {
            return leftOperand;
        }

        Object rightOperand = objectList.get(1);

        if (((leftOperand instanceof String || rightOperand instanceof String) && !getOperator().equals("+"))
                || (!(leftOperand instanceof Double) && !(leftOperand instanceof String))) {
            throw new InvalidOperationException(getOperator() + " operator is not valid for given values.");
        }

        if ((leftOperand instanceof String || rightOperand instanceof String) && getOperator().equals("+")) {
            return leftOperand.toString() + rightOperand.toString();
        }

        if (leftOperand instanceof Double && rightOperand instanceof Double) {
            List<Double> values = objectList.stream().map(value -> (double) value).collect(Collectors.toList());
            Object result;
            switch (getOperator()) {
                case "+":
                    result = add(values);
                    break;

                case "-":
                    result = substract(values);
                    break;

                case "*":
                    result = multiply(values);
                    break;

                case "/":
                    result = divide(values);
                    break;

                case "%":
                    result = modulus(values);
                    break;

                case "^":
                    result = power(values);
                    break;

                default:
                    result = 0.0;
            }
            return result;
        }
        return null;
    }

    public double add(List<Double> values) {
        return values.stream().mapToDouble(Double::doubleValue).sum();
    }

    public double substract(List<Double> values) {
        double result = values.get(0);
        ListIterator<Double> listIterator = values.subList(1, values.size()).listIterator();
        while (listIterator.hasNext()) {
            result -= listIterator.next();
        }

        return result;
    }

    public double multiply(List<Double> values) {
        return values.stream().mapToDouble(Double::doubleValue).reduce(1.0,
                (leftOperand, rightOperand) -> leftOperand * rightOperand);
    }

    public double divide(List<Double> values) {
        double result = values.get(0);
        ListIterator<Double> listIterator = values.subList(1, values.size()).listIterator();
        while (listIterator.hasNext()) {
            result /= listIterator.next();
        }

        return result;
    }

    public double modulus(List<Double> values) {
        double result = values.get(0);
        ListIterator<Double> listIterator = values.subList(1, values.size()).listIterator();
        while (listIterator.hasNext()) {
            result %= listIterator.next();
        }

        return result;
    }

    public double power(List<Double> values) {
        double result = values.get(0);
        ListIterator<Double> listIterator = values.subList(1, values.size()).listIterator();
        while (listIterator.hasNext()) {
            result = Math.pow(result, listIterator.next());
        }

        return result;
    }
}
