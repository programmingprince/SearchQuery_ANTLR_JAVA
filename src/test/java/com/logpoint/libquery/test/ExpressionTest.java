package com.logpoint.libquery.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import com.logpoint.libquery.exceptions.InvalidOperationException;
import org.antlr.runtime.RecognitionException;
import org.junit.Before;
import org.junit.Test;

import com.logpoint.libquery.ExpressionQueryParser;
import com.logpoint.libquery.exceptions.ParseException;

public class ExpressionTest {

    ExpressionQueryParser expressionQueryParser;
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
    public void ExpressionQueryParser_ShouldReturnSingleNumber() {
        try {
            expressionQueryParser.parseQuery("identifier=4.1e10", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), 4.1E10);
    }

    @Test
    public void ExpressionQueryParser_ShouldAddNumbers() {
        try {
            expressionQueryParser.parseQuery("identifier=4+2+3+1", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), 10.0);
    }

    @Test
    public void ExpressionQueryParser_ShouldSubstractNumbers() {
        try {
            expressionQueryParser.parseQuery("identifier=4-1-2", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), 1.0);
    }

    @Test
    public void ExpressionQueryParser_ShouldMultiplyNumbers() {
        try {
            expressionQueryParser.parseQuery("identifier=4*2*2", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), 16.0);
    }

    @Test
    public void ExpressionQueryParser_ShouldDivideNumbers() {
        try {
            expressionQueryParser.parseQuery("identifier=16/2/2", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), 4.0);
    }

    @Test
    public void ExpressionQueryParser_ShouldPowerNumbers() {
        try {
            expressionQueryParser.parseQuery("identifier=2^2^2", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), 16.0);
    }

    @Test
    public void ExpressionQueryParser_ShouldModulusNumbers() {
        try {
            expressionQueryParser.parseQuery("identifier=13%7%4", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), 2.0);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformOperationWithParenthesis() {
        try {
            expressionQueryParser.parseQuery("identifier=(12+4)/(2*4)", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), 2.0);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformOperationWithIdentifiers() {
        try {
            expressionQueryParser.parseQuery("identifier=10+datasize", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), 522.0);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformEqualsOperationForNumbers() {
        try {
            expressionQueryParser.parseQuery("identifier=(512==datasize)", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), true);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformNotEqualsOperationForNumbers() {
        try {
            expressionQueryParser.parseQuery("identifier=(51!=datasize)", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), true);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformGreaterThanOperationForNumbers() {
        try {
            expressionQueryParser.parseQuery("identifier=(1000>datasize)", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), true);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformLessThanOperationForNumbers() {
        try {
            expressionQueryParser.parseQuery("identifier=(100<datasize)", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), true);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformGreaterThanOrEqualsToOperationForNumbers() {
        try {
            expressionQueryParser.parseQuery("identifier=(512>=datasize)", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), true);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformLessThanOrEqualsToOperationForNumbers() {
        try {
            expressionQueryParser.parseQuery("identifier=(100<=datasize)", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), true);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformEqualsOperationForString() {
        try {
            expressionQueryParser.parseQuery("identifier=(protocol==HTTP)", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), true);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformNotEqualsOperationForString() {
        try {
            expressionQueryParser.parseQuery("identifier=(protocol!=FTP)", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), true);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformGreaterThanOperationForString() {
        try {
            expressionQueryParser.parseQuery("identifier=(protocol>FTP)", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), true);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformLessThanOperationForString() {
        try {
            expressionQueryParser.parseQuery("identifier=(protocol<FTP)", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), false);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformGreaterThanOrEqualsOperationForString() {
        try {
            expressionQueryParser.parseQuery("identifier=(protocol>=HTTP)", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), true);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformLessThanOrEqualsOperationForString() {
        try {
            expressionQueryParser.parseQuery("identifier=(protocol<=SMTP)", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), true);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformEqualsOperationForBoolean() {
        try {
            expressionQueryParser.parseQuery("identifier=((2>1)==true)", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), true);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformNotEqualsOperationForBoolean() {
        try {
            expressionQueryParser.parseQuery("identifier=((2<1)!=true)", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), true);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformConcatOperationForString() {
        try {
            expressionQueryParser.parseQuery("identifier=protocol+col_type", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), "HTTPfilesystem");
    }

    @Test
    public void ExpressionQueryParser_ShouldNotPerformSubstractOperationForString() {
        try {
            expressionQueryParser.parseQuery("identifier=protocol-col_type", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), null);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformIfStatementExpression() {
        try {
            expressionQueryParser.parseQuery("identifier=if(datasize<1000, true,false)", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), true);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformCaseStatementExpressionForSingleMatchingCase1() {
        try {
            expressionQueryParser.parseQuery("identifier=case(1<2,10,default,100)", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), 10.0);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformCaseStatementExpressionForSingleMatchingCase2() {
        try {
            expressionQueryParser.parseQuery("identifier=case(1>2,10,2<3,20,3>4,30,default,100)", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), 20.0);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformCaseStatementExpressionForMultipleMatchingCase() {
        try {
            expressionQueryParser.parseQuery("identifier=case(1>2,10,2<3,20,3<4,30,default,100)", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), 20.0);
    }

    @Test
    public void ExpressionQueryParser_ShouldPerformCaseStatementExpressionForNoneMatchingCase() {
        try {
            expressionQueryParser.parseQuery("identifier=case(1>2,10,2>3,20,3>4,30,default,100)", row);
        } catch (ParseException | RecognitionException | InvalidOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        assertEquals(row.get("identifier"), 100.0);
    }
}
