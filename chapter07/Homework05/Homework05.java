package Homework05;

public class Homework05 {
    public static void main(String[] args) {
        Worker worker = new Worker(3251);
        Teacher teacher = new Teacher(5698,20);
        Scientist scientist = new Scientist(9988,562);
        worker.showSalary();
        teacher.showSalary();
        scientist.showSalary();
    }
}
