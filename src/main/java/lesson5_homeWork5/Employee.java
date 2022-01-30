package lesson5_homeWork5;

public class Employee {

    public String name;
    public String post;
    public String email;
    public long telNumber;
    public int age;
    public int salary;

    //  Конструктор
    public Employee(String name, String post, String email, long telNumber, int age, int salary) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.telNumber = telNumber;
        this.age = age;
        this.salary = salary;
    }
    //  Обозначаем что именно нужно выводить в консоль
    public void info() {
        System.out.println("name = " + this.name + "," + " post = " + this.post + "," + " email = " + this.email + "," + " telNumber = " + this.telNumber + "," + " age = " + this.age + "," + " salary = " + this.salary + ";");
    }

}
