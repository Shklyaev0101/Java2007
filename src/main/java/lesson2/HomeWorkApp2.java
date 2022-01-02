package lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        acceptValidMethod();
        transferPosOrNegNumb();
        returnTrueNegOrFalsePos();
        outputStringOnNumb("Wow", 4);
    }

    /*
    1.Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.
    */
    public static void acceptValidMethod() {
        int a = 3;
        int b = 13;
        int sum = a + b;

        if (sum >= 10 | sum <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /*
    Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
     */
    public static void transferPosOrNegNumb() {
        int a = 0;

        if (a % 2 == 0) {
            System.out.println("positive number");
        } else {
            System.out.println("negative number");
        }
    }

    /*
    Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */
    public static void returnTrueNegOrFalsePos() {
        int a = 9;
        //int a = 0;
        //int a = 10;

        if (a % 2 != 0) {
            System.out.println("true");
        } else if (a == 0) {
            System.out.println("Please, enter another number");
        } else {
            System.out.println("false");
        }
    }

    /*
    Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */
    public static void outputStringOnNumb(String text, int numb) {
        for (int i = 0; i < numb; i++) {
            System.out.println(text);
        }
    }
}
