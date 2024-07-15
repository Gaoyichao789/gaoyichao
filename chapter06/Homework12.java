public class Homework12 {

	public static void main(String[] args) {
		Employee employee1 = new Employee("坤发","男",23,"明日方舟博士",114514);
	}
}

class Employee{
	String name;
	String gender;
	int age;
	String job;
	double salary;
	public Employee(String name,String gender,int age,String job,double salary){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.job = job;
		this.salary = salary;  
	}
	public Employee(String name,String gender,int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public Employee(String job,double salary){
		this.job = job;
		this.salary = salary;  
	}
}