import Task1.Task1;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HW4_Test {

    HW4_AllTasks HW4AllTasks = new HW4_AllTasks();
    //1
    @Test
    public void testSum() {

        int[] arrayIs =  {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int actual = HW4AllTasks.sumArray(arrayIs);
        int expected = 0;
        for (int i = 0; i < arrayIs.length; i = i + 1){
            expected = expected + arrayIs[i];
        }
        assertEquals(actual, expected);
    }

    //2
    @Test
    public void testTask2() {
       int[] arrayIs = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int actual = HW4AllTasks.Max(arrayIs);
        int expected = 12;
        assertEquals(actual, expected);
    }
    @Test
    public void testMinValArray() {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        assertEquals(HW4AllTasks.MinValArray(array), 2);
    }

    @Test
    public void testAvarFromArray() {
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        assertEquals(HW4AllTasks.AvarFromArray(array4), 5.111111111111111);
    }

    @Test
    public void testSumArray2() {
        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        assertEquals(HW4AllTasks.SumArray2(array5), 24);
    }
    @Test
    public void tastMaxArray2(){
        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        assertEquals(HW4AllTasks.MaxArray2(array6), 9);
    }

    @Test
    public void tastSumNumbersArray2(){
        int[][] array7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        assertEquals(HW4AllTasks.SumNumbersArray2(array7), 15);
    }
    @Test
    public void PrintO(){
        String s = "Перестановочный алгоритм быстрого действия";
        assertEquals(HW4AllTasks.PrintO(s), "ооооо");
    }
    @Test
    public void PrintNumberE(){
        String s = "Перевыборы выбранного президента";
        assertEquals(HW4AllTasks.PrintNumberE(s), 4);
    }
    @Test
    public void IndexRit(){
        String str = "Посмотрите как Рите нравится ритм";
        int[] array = {6, 15, 29};
        assertEquals(HW4AllTasks.IndexRit(str), array);
        //через array list (вводных 2 substring и string)//
    }

    @Test
    public void NumberNotE(){
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        assertEquals(HW4AllTasks.NumberNotE(array), 4);
    }


}