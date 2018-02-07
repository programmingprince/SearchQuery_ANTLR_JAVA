package com.logpoint.libquery;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import com.logpoint.libquery.exceptions.InvalidOperationException;
import com.logpoint.libquery.grammar.ExpressionLexer;
import com.logpoint.libquery.grammar.ExpressionParser;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

import com.logpoint.libquery.exceptions.ParseException;
import com.logpoint.libquery.expressions.Expression;

public class ExpressionQueryParser {
    public void parseQuery(String searchQuery, Map<String, Object> row) throws ParseException, RecognitionException, InvalidOperationException {
        ExpressionParser parser = getExpressionParser(searchQuery);
        parser.setRow(row);
        ExpressionParser.expression_return parsedExpression = parser.expression();
        Tree tree = parsedExpression.getTree();
        List<String> errors = parser.getErrors();
        if (errors.size() > 0) {
            throw new ParseException(String.join("\n", errors));
        }

        Expression rootExpression = parsedExpression.expression;
        Object result = rootExpression.evaluateExpression();
        row.put(tree.getChild(0).getText(), result);
    }

    public ExpressionParser getExpressionParser(String searchQuery) {
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
