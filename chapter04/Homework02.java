import java.util.Scanner;
public class Homework02 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入整数进行判断：");
		int number = myScanner.nextInt();
		if (number < 0){
			System.out.println("该数为负数");
		}
		else if (number == 0){
			System.out.println("该数为0");
		}
		else if (number > 0){
			System.out.println("该数为正数");
		}
	}
}