package lesson2;

public class SwitchApp {

    public static void main(String[] args) {
        /*checkOrderStatus2("DELIVERED");
        checkOrderStatus2("IN_DELIVERY");*/

        checkOrderStatus2("SHIPPED");
        checkOrderStatus2("IN_DELIVERY");
        String month = "JAN";
        switch (month) {
            case "DEC":
            case "JAN":
            case "FEB": {
                System.out.println("Winter");
                break;
            }
        }
    }


    public static void checkOrderStatus(String orderStatus) {   //проверяем статус заказа
        if (orderStatus.equals("ACCEPTED")) {   //equals - сравнивает две строки
            System.out.println("Принят");
        } else if (orderStatus.equals("DELIVERED") ) {
            System.out.println("Доставлен");
        } else {
            System.out.println("Неизвестный статус заказа");
        }
    }


    public static void checkOrderStatus2(String orderStatus) {
        switch (orderStatus) {  //валидный оператор_переключалка - переключает исполнение кода
            case "ACCEPTED": {
                System.out.println("Принят");
                break;  //оператор, который разрывает блок кода
            }
            case "DELIVERED": {
                System.out.println("Доставлен");
                break;
            }
            case "SHIPPED":
            case "IN_DELIVERY": {
                System.out.println("В доставке");
                break;
            }
            default: {
                System.out.println("Неизвестный статус заказа");
            }
        }
    }
}
