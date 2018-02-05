package com.logpoint.libquery.parsers;

import java.util.List;

import com.logpoint.libquery.expressions.Expression;

public class ExpressionQuery implements IExpressionQuery {
	private List<Expression> expressions;

	public List<Expression> getExpressions() {
		return expressions;
	}

	public void setExpressions(List<Expression> expressions) {
		this.expressions = expressions;
	}
}
