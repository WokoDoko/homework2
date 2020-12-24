package geekbrains.secondVebinar;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] reversedNumbers = {1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1};//первый массив
        int[] empty = new int[8];//второй массив
        int[] randomNum = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};//третий массив
        int[][] squaredArray = new int[4][4]; //четвертый массив
        firstMethod(reversedNumbers);//вызов первого массива
        secondMethod(empty);//вызов второго массива
        thirdMethod(randomNum);//вызов третьего
        fourthMethod(squaredArray);//вызов четвертого массива
    }

    public static void firstMethod(int[] array) { //метод для первого пункта
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                array[i] = 1;
            else
                array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void secondMethod(int[] array) { //метд для второго пункта
        for (int i = 1; i <= 7; i++) {
            array[i] = array[i - 1] + 3;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void thirdMethod(int[] array) { //метод для третьего пункта
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 6)
                array[i] *= 2;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fourthMethod(int[][] sqArray) { //метод для четвертого массива
        for (int i = 0; i < sqArray.length; i++) {
            for (int j = 0; j < sqArray[i].length; j++) {
                if (i == j) {
                    sqArray[i][j] = 1;
                }
                System.out.print(sqArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fifthMethod(int[] minAndMax) {//метод для пятого массива
        //проверяю просто, как это все работает
    }
}



