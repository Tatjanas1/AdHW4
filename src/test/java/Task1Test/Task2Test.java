package Task1Test;

import Task1.Task2;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2Test {

    @Test
    public void testTask2() {
        Task2 arr = new Task2();
        int[] arrayIs = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int actual = arr.Max(arrayIs);
        int expected = 12;
        assertEquals(actual, expected);
    }
}