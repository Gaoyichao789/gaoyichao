package Homework05;

public class Teacher extends Employee{
    private double LessonSalary;
    public Teacher(double salary, double LessonSalary) {
        super(salary);
        this.LessonSalary = LessonSalary;
    }

    public double getLessonSalary() {
        return LessonSalary;
    }

    public void setLessonSalary(double lessonSalary) {
        LessonSalary = lessonSalary;
    }

    @Override
    public void showSalary() {
        System.out.println(getSalary() + 365 * getLessonSalary());
    }
}
