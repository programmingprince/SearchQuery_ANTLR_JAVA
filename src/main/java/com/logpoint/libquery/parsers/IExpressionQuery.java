package com.logpoint.libquery.parsers;

import java.util.List;

import com.logpoint.libquery.expressions.Expression;

public interface IExpressionQuery {
	public List<Expression> getExpressions();

	public void setExpressions(List<Expression> expressions);
}
