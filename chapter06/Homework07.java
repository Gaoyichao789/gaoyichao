public class Homework07 {

	public static void main(String[] args) {
		Dog dog1 = new Dog("一发居士","黄色",22);
		Dog dog2 = new Dog("二发居士","绿色",2);
		dog1.show();
		dog2.show();
	}
}
class Dog{
	String name;
	String color;
	int age;
	public Dog(String name,String color,int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void show(){
		System.out.println("小狗信息为" + name + color + age);
	}
}