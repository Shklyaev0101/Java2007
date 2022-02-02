package lesson2;

public class WhileApp {
    public static void main(String[] args) {

        int i=10;
        while (i > 0) { // может и не вызваться
            if( i% 2 ==0 ) {
                i--;
                continue;
            }
            System.out.println(i);
            i--;
        }

        int j = -10;
        do { // вызовется
            System.out.println("j=" + j);
            j--;
        } while (j >0);
    }
}





// бесконечный цикл !!!!! не запускать !!!!!
        /*while (true){ // infinity
        }*/