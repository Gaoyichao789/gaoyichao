package Homework03;

public class AssProfessor extends Teacher{
    public AssProfessor(String name, int age, String post, double salary){
        super(name, age, post, salary);
    }

    public void introduce(){
        System.out.println("姓名" + getName() + "年龄" +
                getAge() + "职位" + getPost() + "薪水" + getSalary() * 1.2);
    }
}
