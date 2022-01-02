package lesson2;

public class MethodApp {

    public static final String TEMPLATE = "int = %d string = %s\n";

    public static void main(String[] args) {

        int v1 = multiplication(4, 10);
        int v2 = multiplication(5, 6.0);
        //int v3 = multiplication(v1, v2);


        PrintUtil.printFormatted("v1 = " + v1 + " v2 = " + v2 + " v3 = " + multiplication(v1, v2));

        PrintUtil.printFormatted("string to format");


        System.out.printf(TEMPLATE, 10, "str");
        System.out.println();
        System.out.printf(TEMPLATE, 113, "st12313r");

        //TEMPLATE = "abc"; // нельзя

    }


    public static int multiplication(int n1, int n2) {
        //int result = n1 * n2;
        //return result;
        return n1 * n2; //когда пишем в одну линию, называется - инлайнить
    }

    public static int multiplication(int n1, double n2) {
        return (int) (n1 * n2); //приводим к - int
    }

    // когда сть несколько схожих методотов, то это называется !!! перегрузка методов !!!

    public static int multiplication(double n1, int n2) { //порядок аргументов важен
        return (int) (n1 * n2);
    }

    //модификатор доступа + тип значения + имя + Набор параметров


    //naming - ClassName MyClassName (класс всегда пишется с большой буквы - шрифт - CamelCase)


    //methods, variables - loaderCaseUpperCase methodName variableName (все остальное пишется с маленькой буквы)


    //CONSTANTS  - UPPER_CASE (шрифт - snake_case) (константы - те значения которые никогда не меняются)


    //type - void / real type (типы значений)


    /* public - protected - (no modifier) default - private (модификаторы доступа - 4 шт) :

    public -  доступен всем;

    protected -   видят только соседи и дети (в рамках пакет и наследникам);

    (no modifier) default -   тем, которые лежат в твоем пакете (в рамках пакета);

    private - с наружи никто вызвать не может (в рамках класса).

    */


}
