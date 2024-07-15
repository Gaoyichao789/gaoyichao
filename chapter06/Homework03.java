import java.util.Scanner;
public class Homework03 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入原价:");
		double price = myScanner.nextDouble();
		BOOK book1 = new BOOK();
		System.out.println("更新后的价格为" + book1.updatePrice(price));
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