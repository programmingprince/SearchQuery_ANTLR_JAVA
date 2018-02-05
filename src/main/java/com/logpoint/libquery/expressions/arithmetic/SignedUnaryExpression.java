package com.logpoint.libquery.expressions.arithmetic;

import com.logpoint.libquery.expressions.Expression;

public class SignedUnaryExpression extends UnaryArithmeticExpression implements Expression<Double> {
    String sign;

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }


    @Override
    public Double evaluateExpression() {
        return getSign().equals("+")?(+getValue()):(-getValue());
    }
}


