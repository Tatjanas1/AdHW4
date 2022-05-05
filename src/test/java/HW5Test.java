import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HW5Test {

    @DataProvider
    public Object[][] SumOf2 (){
        return new Object[][] {
                {5, 7, 12},
                {1, 4, 5}
        };
    }
    @Test (dataProvider = "SumOf2")
    public void testSumOf2(int a, int b, int expected) {
        int actual = HW5.sumOf2(a,b);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] MinusOf2(){
        return new Object[][]{
                {4, 6, -2},
                {5, -25, 30}
        };
    }
    @Test (dataProvider = "MinusOf2")
    public void testMinusOf2(int a, int b, int expected) {
        int actual = HW5.minusOf2(a, b);
        assertEquals(actual, expected);
    }
    @DataProvider
    public Object[][] MultiplOf2(){
        return new Object[][]{
                {4, 6, 24},
                {5, -25, -125}
        };
    }
    @Test (dataProvider = "MultiplOf2")
    public void testMultiplOf2(int a, int b, int expected) {
        int actual = HW5.multiplOf2(a, b);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] DevisionOf2(){
        String result = "Infinity";
        return new Object[][]{
                {24, 6 , 4},
                {0, 5, 0},
                {5, 0, result},
        };
    }
    @Test (dataProvider = "DevisionOf2")
    public void testDevisionOf2(int a, int b, double expected) {
        double actual = HW5.devisionOf2(a, b);
        assertEquals(actual, expected);
    }
}