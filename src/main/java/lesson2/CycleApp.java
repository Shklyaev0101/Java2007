package lesson2;

public class CycleApp {

    public static void main(String[] args) {

//10 % 3 = 1 (остаток на деление)
        for (int i = 0; i < 10; i++) {  //i++ увеличения аргумента
            if (i % 2 == 0) {
                continue;   //оператор, кот. используя условие_/см. строку выше/ переносит в начало цикла
            }
            if (i > 6) {
                break;      //оператор, кот. используя условие_/см. строку выше/_если оно есть/ разрывает цикл полностью
            }
            PrintUtil.printFormatted("string " + i);
        }
        System.out.println(getDividedByThree());

        // обратный цикл
     /*   for (int i=10; i > 0; i--){
            System.out.println(i);
        }*/

        // Цикл может содержать более одной переменной
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i=" + i + " j=" + j);
        }

        System.out.println();

        //Вложенный цикл
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i=" + i + " j=" + j);
            }
        }
    }


    public static int getDividedByThree() {
        //for (int i = 1; i < 10; i++) {
        //for (int i = 1; i < 10; i+2) {
        for (int i = 2; i < 10; i = i + 2) {
            if (i % 3 == 0) {
                return i;
            }
        }
        return 0;   // если не найдем по результату цикла, что делится на - 3, то возвращаем - 0
    }
}




// бесконечный цикл !!!!!! не запускать !!!!!!
       /* for(;;){
        }*/