package Homework11;

public class Homework11 {
    public static void main(String[] args) {
        Person p = new Student();
        p.run();
        p.eat();
        Student s = (Student)p;
        s.run();
        s.study();
        s.eat();
    }
}
