package Task1Test;

import Task1.Task1;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task1Test {


    @Test
    public void testSum() {
        Task1 array = new Task1();
        int[] arrayIs =  {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int actual = array.sumArray(arrayIs);
        int expected = 0;
        for (int i = 0; i < arrayIs.length; i = i + 1){
            expected = expected + arrayIs[i];
        }
        assertEquals(actual, expected);
    }

}