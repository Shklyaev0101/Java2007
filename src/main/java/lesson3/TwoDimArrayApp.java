package lesson3;

import java.util.Arrays;

public class TwoDimArrayApp {   //двумерный массив - много объектов памяти объединенных вместе

    public static void main(String[] args) {
        int[][] array = new int[5][5];  // объявление двумерного массива

        array[2][2] = 100;  //заполнение элементом - 100 значение 2 и 2
        for (int i = 0; i < array.length; i++) {            //  вложенный цикл выводит двумерный массив и авт. заполн - 0
            for (int j = 0; j < array[i].length; j++) {     //
                System.out.print(array[i][j] + " ");        //
            }                                               //
            System.out.println();                           //
        }

        for (int i = 0; i < array.length; i++) {            // альтернативная запись нашего массива, делают одну и ту же работу
            System.out.println(Arrays.toString(array[i])); // [] тут одномерный массив
        }


        System.out.println(Arrays.toString(array)); //[][] ,т.к сюда передаем двумерный массив


        int[] subArray = array[2];


        System.out.println();
        System.out.println();
        System.out.println();

        int[][] newArray = new int[5][];    //при объявлении массива не указываем сколько выделять памяти для подмассивов

        newArray[0] = new int[]{1, 2, 3};
        newArray[1] = new int[]{1, 2, 3, 4, 5};
        newArray[2] = new int[]{1};
        newArray[3] = new int[]{1, 1};

        System.out.println(Arrays.toString(newArray));
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(Arrays.toString(newArray[i])); // []
        }


        int[][] arr = {{1, 2}, {3, 4}, {5, 6, 7}};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i])); // []
        }

        // int [][][][]


        char[] chars = "Java".toCharArray(); //new char[];
        System.out.println(chars[2]);

        System.out.println("Java".charAt(3));



    }
}
