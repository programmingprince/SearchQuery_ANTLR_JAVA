package com.logpoint.libquery;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

import com.logpoint.libquery.exceptions.ParseException;
import com.logpoint.libquery.expressions.Expression;
import com.logpoint.libquery.grammar.ExpressionLexer;
import com.logpoint.libquery.grammar.ExpressionParser;

public class ExpressionQueryParser {
	public Map<String, Object> parseQuery(String searchQuery, Map<String, Object> row) throws ParseException, RecognitionException {
		ExpressionParser parser = getSearchQueryParser(searchQuery);
		parser.setRow(row);
		ExpressionParser.expression_return parsedExpression = parser.expression();
		Tree tree = parsedExpression.getTree();
		List<String> errors = parser.getErrors();
		if (errors.size() > 0) {
			throw new ParseException(String.join("\n", errors));
		}

		Expression rootExpression = parsedExpression.expression;
		row.put(tree.getChild(0).getText(), rootExpression.evaluateExpression());
		return row;
	}

	public ExpressionParser getSearchQueryParser(String searchQuery) {
		ANTLRNoCaseStringStream in = null;
		try {
			in = new ANTLRNoCaseStringStream(searchQuery);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		ExpressionLexer lexer = new ExpressionLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExpressionParser parser = new ExpressionParser(tokens);
		return parser;
	}
}
