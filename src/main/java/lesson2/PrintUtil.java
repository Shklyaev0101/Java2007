package lesson2;

public class PrintUtil {

    //JavaDoc:
    /**
     * Форматирует строку тремя * до и после
     *
     * @param str строка для форматирования
     */
    public static void printFormatted(String str) {
        //System.out.println("***" + str + "***");
        System.out.printf("***%s***", str); //это print formatted
        System.out.println();               //все тот же print formatted
    }

    /**
     * Форматирует строку тремя * до и после
     *
     * @param str строка для форматирования
     */
    public static String getFormatted(String str) {
        return "***" + str + "***";
    }


    public static void doSmth() {

    }
}
