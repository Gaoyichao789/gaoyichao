import java.util.Random;
public class Homework05 {

	//��дһ��main����
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
		System.out.println("���ֵΪ"+ b[0]);
		int sum = 0;
		for(int i = 0;i <= 9;i++){
			if(a[i] == b[0]){
				System.out.println("���ֵΪ��"+ (i + 1) + "��");
			}
			sum = sum + a[i];
			if(a[i] == 8){
				System.out.println("������ֵ8Ϊ��"+ (i + 1) + "��");
			}
		}
		double equal = sum / 10;
		System.out.println("�ܺ�Ϊ" + sum + ",ƽ��ֵΪ" + equal);
	}
}