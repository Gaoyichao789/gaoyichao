import java.util.Scanner;
public class Homework02 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���������������жϣ�");
		int number = myScanner.nextInt();
		if (number < 0){
			System.out.println("����Ϊ����");
		}
		else if (number == 0){
			System.out.println("����Ϊ0");
		}
		else if (number > 0){
			System.out.println("����Ϊ����");
		}
	}
}