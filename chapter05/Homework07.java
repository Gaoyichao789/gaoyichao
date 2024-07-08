import java.util.Random;
public class Homework07 {

	//编写一个main方法
	public static void main(String[] args) {
		int a[] = new int[10];
		Random rand = new Random();
		for(int i = 0;i <= 9;i++){
			int randomNumber = rand.nextInt(100) + 1;
			a[i] = randomNumber;
		}
		
		for(int i = 1;i <= 9;i++){
			for(int j = 0;j <= 9-i;j++){
				int temp = 0;
				if(a[j] > a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i = 0;i <= 9;i++){
			System.out.print(a[i] + "\t");
		}
		}}
		