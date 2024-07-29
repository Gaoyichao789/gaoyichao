package Homework03;

public class Lecturer extends Teacher{
    public Lecturer(String name, int age, String post, double salary){
        super(name, age, post, salary);
    }

    public void introduce(){
        System.out.println("姓名" + getName() + "年龄" +
                getAge() + "职位" + getPost() + "薪水" + getSalary() * 1.1);
    }
}
