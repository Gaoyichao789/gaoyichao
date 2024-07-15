import java.util.Scanner;
public class Homework06 {

	public static void main(String[] args) {
		double x1 = 5;
		double x2 = 6;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入运算符号:");
		char operator = myScanner.next().charAt(0);
		Cale cal1 = new Cale();
		if(operator == '+'){
			System.out.println("运算结果为:" + cal1.numAdd(x1,x2));
		}
		else if(operator == '-'){
			System.out.println("运算结果为:" + cal1.numminus(x1,x2));
		}
		else if(operator == '*'){
			System.out.println("运算结果为:" + cal1.nummultiplicate(x1,x2));
		}
		else if(operator == '/'){
			System.out.println("运算结果为:" + cal1.numdivision(x1,x2));
		}
		
	}
}
class Cale{
	public double numAdd(double n1,double n2){
		double result = n1 + n2;
		return result;
	}

	public double numminus(double n1,double n2){
		double result = n1 - n2;
		return result;
	}

	public double nummultiplicate(double n1,double n2){
		double result = n1 * n2;
		return result;
	}

	public double numdivision(double n1,double n2){
		if(n2 == 0){
			System.out.println("除数不能为0");
			return 0;
		} 
		else{
			double result = n1 / n2;
			return result;
		}
	}
}