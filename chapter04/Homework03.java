import java.util.Scanner;
public class Homework03 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入年份进行判断：");
		int number = myScanner.nextInt();
		if (number % 4 == 0 && number % 100 != 0){
			System.out.println("该年为闰年");
		}
		else if (number % 400 == 0){
			System.out.println("该年为闰年");
		}
		else {
			System.out.println("该年为平年");
		}
	}
}