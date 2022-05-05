package Task1;

import java.util.Arrays;

public class Task1 {
    public static int sumArray(int[] array){
        int result = Arrays.stream(array).sum();
        return result;
    }
}
