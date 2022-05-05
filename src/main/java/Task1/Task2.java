package Task1;

public class Task2 {
    public static int Max (int[] array){
        int i = 0;
        int x = Integer.MIN_VALUE;

        while (i < array.length) {
            if (array[i] > x) {
                x = array[i];
                i = i + 1;
            } else {
                i = i + 1;
            }
        }
        return x;
    }
}
