package com.logpoint.libquery.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.RecognitionException;
import org.junit.Before;
import org.junit.Test;

import com.logpoint.libquery.ExpressionQueryParser;
import com.logpoint.libquery.exceptions.ParseException;

public class ExpressionTest {

    ExpressionQueryParser expressionQueryParser;
    Map<String, Object> result;
    Map<String, Object> row;

    public ExpressionTest() {
        expressionQueryParser = new ExpressionQueryParser();
    }

    @Before
    public void initialize() {
        row = new HashMap<String, Object>();
        row.put("col_type", "filesystem");
        row.put("source_address", "10.94.1.104");
        row.put("sig_id", 1232);
        row.put("protocol", "HTTP");
        row.put("datasize", 512);
    }

    @Test
    public void ExpressionQueryParser_ShouldAddNumbers() {
        try {
            result = expressionQueryParser.parseQuery("identifier=4+2+3+1", row);
        } catch (ParseException | RecognitionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        row.put("identifier", 10.0);
        assertEquals(row, result);
    }

    @Test
    public void ExpressionQueryParser_ShouldSubstractNumbers() {
        try {
            result = expressionQueryParser.parseQuery("identifier=4-1-2", row);
        } catch (ParseException | RecognitionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        row.put("identifier", 1.0);
        assertEquals(row, result);
    }

    @Test
    public void ExpressionQueryParser_ShouldMultiplyNumbers() {
        try {
            result = expressionQueryParser.parseQuery("identifier=4*2*2", row);
        } catch (ParseException | RecognitionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        row.put("identifier", 16.0);
        assertEquals(row, result);
    }

    @Test
    public void ExpressionQueryParser_ShouldDivideNumbers() {
        try {
            result = expressionQueryParser.parseQuery("identifier=16/2/2", row);
        } catch (ParseException | RecognitionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        row.put("identifier", 4.0);
        assertEquals(row, result);
    }

    @Test
    public void ExpressionQueryParser_ShouldPowerNumbers() {
        try {
            result = expressionQueryParser.parseQuery("identifier=2^2^2", row);
        } catch (ParseException | RecognitionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        row.put("identifier", 16.0);
        assertEquals(row, result);
    }

    @Test
    public void ExpressionQueryParser_ShouldModulusNumbers() {
        try {
            result = expressionQueryParser.parseQuery("identifier=13%7%4", row);
        } catch (ParseException | RecognitionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        row.put("identifier", 2.0);
        assertEquals(row, result);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformOperationWithParenthesis() {
        try {
            result = expressionQueryParser.parseQuery("identifier=(12+4)/(2*4)", row);
        } catch (ParseException | RecognitionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        row.put("identifier", 2.0);
        assertEquals(row, result);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformOperationWithIdentifiers() {
        try {
            result = expressionQueryParser.parseQuery("identifier=10+datasize", row);
        } catch (ParseException | RecognitionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        row.put("identifier", 522.0);
        assertEquals(row, result);
    }
}
