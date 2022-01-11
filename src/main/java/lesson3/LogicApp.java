package lesson3;

public class LogicApp {

    public static void main(String[] args) {
        // УСЛОВНЫЕ ОПЕРАТОРЫ:

        // ИЛИ  ||  |    +  //логическое сложение

        // 0 - false
        // 1 - true

        // 0 0 -> 0
        // 0 1 -> 1
        // 1 0 -> 1
        // 1 1 -> 1

        // И    &&  &   *   //логическое умножение
        // 0 0 -> 0
        // 0 1 -> 0
        // 1 0 -> 0
        // 1 1 -> 1

        // НЕ   !

        int a = 0;
        if (!isPositive(a) || !isZero(a)) {    //чтоб выполнить обе проверки оставляем один - &
            System.out.println("Положительно и не 0");
        }



        if (!isPositive(a) || isZero(a)) {  //чтоб выполнить обе проверки оставляем один - &

        }
    }


    public static boolean isPositive(int val) {
        return val >= 0;
    }


    public static boolean isZero(int val) {
        return val == 0;
    }
}
