package Homework04;

public class Manager extends Employee{
    public Manager(String name, double salary, int workday){
        super(name, salary, workday);
    }

    public void showSalary(){
        System.out.println("工资为" + getSalary() * getWorkday() * 1.2 + 1000);
    }
}
