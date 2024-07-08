import java.util.Random;
public class Homework05 {

	//编写一个main方法
	public static void main(String[] args) {
		int a[] = new int[10];
		Random rand = new Random();
		for(int i = 0;i <= 9;i++){
			int randomNumber = rand.nextInt(100) + 1;
			a[i] = randomNumber;
		}
		int b[] = new int[10];
		for(int i = 0;i <= 9;i++){
			b[i] = a[i];
		}
		for(int i = 1;i <= 9;i++){
			for(int j = 0;j <= 9-i;j++){
				int temp = 0;
				if(b[j] < b[j+1]){
					temp = b[j];
					b[j] = b[j+1];
					b[j+1] = temp;
				}
			}
		}
		for(int i = 0;i <= 9;i++){
			System.out.print(b[i] + "\t");
		}
		System.out.println("最大值为"+ b[0]);
		int sum = 0;
		for(int i = 0;i <= 9;i++){
			if(a[i] == b[0]){
				System.out.println("最大值为第"+ (i + 1) + "项");
			}
			sum = sum + a[i];
			if(a[i] == 8){
				System.out.println("存在数值8为第"+ (i + 1) + "项");
			}
		}
		double equal = sum / 10;
		System.out.println("总和为" + sum + ",平均值为" + equal);
	}
}