package lesson5_homeWork5;

import java.util.Arrays;

public class homeWork5 {

    public static void main(String[] args) {
        //Employee employee = new Employee("Ivanov Ivan Ivanovich","lawyer", "didima@mailbox.com", 7999999999L, 33, 1000);

        //  Создаем массив
        Employee[] employee = new Employee[5]; // Вначале объявляем массив объектов
        employee[0] = new Employee("Shvarz Danil Andreevich", "engineer", "ivivan1@mailbox.com", 792312312L, 22, 1500);
        employee[1] = new Employee("Ivanov Ivan Ivanovich", "lawyer", "ivivan2@mailbox.com", 7999999999L, 33, 1000);
        employee[2] = new Employee("Medvedev Denis Petrovich", "builder", "ivivan3@mailbox.com", 7999999998L, 43, 1300);
        employee[3] = new Employee("Shtolc Oleg Denisovich", "architect", "ivivan4@mailbox.com", 7999999996L, 53, 1100);
        employee[4] = new Employee("God Bruce Zevsovich", "creator", "goGod@mailbox.com", 7999999997L, 77, 7777);

        //  Вывод в консоль
        employee[0].info();
        employee[1].info();
        employee[2].info();
        employee[3].info();
        employee[4].info();

        System.out.println();   // просто пустая строка для удобства_см/вывод в консоле

        //  Цикл для определения сотрудников больше 40 лет и вывод в консоль
        for (int i = 0; i < employee.length; i++)
            if (employee[i].age > 40)
                employee[i].info();

    }
}
