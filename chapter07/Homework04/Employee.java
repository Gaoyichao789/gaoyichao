package Homework04;

public class Employee {
    private String name;
    private double salary;
    private int workday;

    public Employee(String name, double salary, int workday) {
        this.name = name;
        this.salary = salary;
        this.workday = workday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkday() {
        return workday;
    }

    public void setWorkday(int workday) {
        this.workday = workday;
    }

    public void showSalary(){
        System.out.println("工资为" + getSalary() * getWorkday());
    }
}
