import java.util.Scanner;
public class Homework03 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������ԭ��:");
		double price = myScanner.nextDouble();
		BOOK book1 = new BOOK();
		System.out.println("���º�ļ۸�Ϊ" + book1.updatePrice(price));
	}
}

class BOOK{
	public double updatePrice(double n){
		if(n > 150){
			return 150;
		}
		else if (n > 100 && n < 150){
			return 100;
		}
		else{
			return n;
		}
	}
}