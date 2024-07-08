import java.util.Scanner;
public class Homework04 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入三位整数进行判断：");
		int number = myScanner.nextInt();
		int h = number / 100;
		int d = (number % 100) /10;
		int u = number - 100 * h - 10 * d;		
		if ((h * h * h + d * d * d + u * u * u) == number){
			System.out.println("该数为水仙花数");
		}
		else{
			System.out.println("该数不为水仙花数");
		}
	}
}