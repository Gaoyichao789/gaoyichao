import java.util.Scanner;
public class Homework05 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入半径:");
		double redius = myScanner.nextDouble();
		Circle a = new Circle();
		System.out.println("周长为" + a.forPerimeter(redius));
		System.out.println("面积为" + a.forArea(redius));
	}
}
class Circle{
	public double forPerimeter(double n){
		double perimeter = Math.PI * 2 * n;
		return perimeter;
	}

	public double forArea(double n){
		double area = Math.PI * Math.pow(n,2);
		return area;
	}
}