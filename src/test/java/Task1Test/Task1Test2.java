package Task1Test;

import Task1.Task1;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task1Test2 {

   int[] arrayIs2 =  {1, 2, 3, 4, 5};
    @Test
    public void testSum() {
        Task1 array = new Task1();
        int actual = array.sumArray(arrayIs2);
        int expected = 15;
        assertEquals(actual, expected);
    }
    @Test
    void test2Sum(){
        int actual = Task1.sumArray(arrayIs2);

    }

}