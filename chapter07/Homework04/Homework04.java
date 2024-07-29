package Homework04;

public class Homework04 {
    public static void main(String[] args) {
        Worker worker = new Worker("一发居士",2.5,7);
        Manager manager = new Manager("二发居士",2500,3);
        worker.showSalary();
        manager.showSalary();
    }
}
