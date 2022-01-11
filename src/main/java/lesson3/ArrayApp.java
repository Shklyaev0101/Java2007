package lesson3;

import java.util.Arrays;

public class ArrayApp {

    public static int variable = 100;

    public static void main(String[] args) {
        int[] array = new int[5];
        //int[] array2 = array; // область памяти в данном случае не выделится
        array[2] = 199;         //  в ячейку 2 устанавливается значение - 199
        array[array.length - 1] = 100;  //  !устанавливаем значение в последнюю ячейку!

        for (int i = 0; i < array.length; i++) {    //  заполнение массива данными
            array[i] = 100 + i * 100;
        }

        int[] arr = {1, 3, 4, 5, 6};    // создание массива с инициализацией (упрощенная запись)

        printArray(array);
        printArray(arr);

        String[] strings = new String[10];  //  ссылочный массив

        Arrays.fill(strings, "a");      //  данный метод пишет "а" во всех ячейках (элементах)


        //System.out.println(strings);
        System.out.println(Arrays.toString(strings));   // данный метод может выводить ссылочный массив (как и все типы данных)
                                                        // данный метод принимает массив и выводит в (например) в строку

        boolean[] booleans = {};                        //  массив длины - 0 (пустой массив, без элементов)
        System.out.println(Arrays.toString(booleans));

        int integer = 100;                              // примитивные методы передают значение, тут будет 100
        //method1(integer);
        integer = method1(integer); // вот так будет присвоение
        System.out.println("integer = " + integer);


        int[] integers = {1, 2, 3, 4, 5, 6};            // когда передаем массив (ссылочный тип), то будет меняться
        method2(integers);
        System.out.println(Arrays.toString(integers));


    }


    public static int method1(int a) {
        //  а = а + 10;
        return variable + 10;
    }

    public static void method2(int[] a) {
        a[2] = 100500;
    }

    public static void printArray(int[] array) {    //вывод массива - метод int
        for (int i = 0; i < array.length; i++) {    //данный метод может любой массив вывести в строку
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int getAvg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum / array.length;

    }

}
