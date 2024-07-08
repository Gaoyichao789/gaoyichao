import java.util.Scanner;
public class Homework04 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int a [] = {10,12,45,90};
		System.out.println("请输入添加的元素：");
		int number = myScanner.nextInt();
		int b [] = new int [a.length + 1];
		int count = 0;
		for(int i = 0;i <= 3;i++){
			if(a[i] < number){
				count++;
			}
			else{
				break;
			}
		}
		for(int j = 0;j <= 4;j++){
			if(j < count){
				b[j] = a[j];
			}
			else if (j == count){
				b[j] = number;
			}
			else if (j > count){
				b[j] = a[j-1];
			}
		}
		for(int m = 0;m <= 4;m++){
			System.out.print(b[m] + "\t");
		}

	}
}