import java.util.Scanner;
public class Homework03 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��������ݽ����жϣ�");
		int number = myScanner.nextInt();
		if (number % 4 == 0 && number % 100 != 0){
			System.out.println("����Ϊ����");
		}
		else if (number % 400 == 0){
			System.out.println("����Ϊ����");
		}
		else {
			System.out.println("����Ϊƽ��");
		}
	}
}