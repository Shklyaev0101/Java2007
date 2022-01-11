package lesson3;
//строки
public class StringApp {

    public static void main(String[] args) {
        String str = "new String";                      // два способа объявления строк (одинаковы)
        String str2 = "new string";

        boolean eq = str == str2;                       // все ссылочные сравниваются через - equals
        str.equals(str2);                               // сравнение объектов через - equals
    }
}

// рекурсия - метод вызывает сам себя