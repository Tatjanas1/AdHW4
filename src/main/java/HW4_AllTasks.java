import java.util.Arrays;
import java.util.Locale;

public class HW4_AllTasks {
    //1
    public static int sumArray(int[] array){
        int result = Arrays.stream(array).sum();
        return result;
    }
    //2
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
    //3
    int i = 0;
    public int MinValArray(int [] array){

        int min = array[0];
        for (i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array [i];
            }
        }
        return min;
    }
    //4
    public double AvarFromArray (int[] array){
        double sum = 0;
        for (i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum/array.length;
    }
    //5
    public int SumArray2 (int[][] array2){
        int sum = 0;
        for (i=0; i < array2.length; i = i + 1){
            for (int j = 0; j < array2[i].length; j = j+1){
                sum = sum + array2[i][j];
            }
        }
        return sum;
    }
    //6
    public int MaxArray2(int[][] array){
        int max = array[0][0];
        for (i = 0; i < array.length; i++ ){
            for (int j = 0; j < array[i].length; j++){
             if (max < array[i][j]){
                 max = array[i][j];
             }
            }
        }
        return max;
    }
    //7
    public int SumNumbersArray2(int[][] array){
        int sumN = 0;
        for (i = 0; i < array.length; i++ ){
            sumN = sumN + array[i].length;
        }
        return sumN;
    }

    // Part 2
    //1
    public String PrintO(String str){
        String subStr = "";
        for (i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'о'){
                subStr = subStr + "о";
            }
        }
        return subStr;
    }
    //2
    public int PrintNumberE(String str) {
        int n = 0;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'е') {
                n = n + 1;
            }
        }
        return n;
    }
    //3

    public int[] IndexRit(String s){
        int[] array = new int[0];
        int j = 0;
        s = s.toLowerCase(Locale.ROOT);
        String subStr = "рит";
        for (i = 0; i < s.length() - 1; i++){
            if (s.substring(i, i + 2).equals("рит")){
                array[j] = i;
            }
        }
        return array;
    }
    //4
    public int NumberNotE(String[][] array){
        int n = 0;
        for (int i = 0; i < array.length; i = i + 1) {
            for (int j = 0; j < array[i].length; j = j + 1) {
                if (!array[i][j].contains("е")) {
                    n = n + 1;
                }
            }
        }
        return n;
    }

}
