import java.util.Scanner;
public class Homework04 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������Ԫ�ظ���:");
		int length = myScanner.nextInt();
		int arr[] = new int[length];
		for(int i = 0;i < length;i++){
			System.out.println("�������±����Ϊ" + i + "��Ԫ����ֵ:");
			int num = myScanner.nextInt();
			arr[i] = num;
		} 
		A03 a = new A03();

		for(int i = 0;i < length;i++){
			System.out.println(a.copyArr(arr)[i]);
		}
	}
}

class A03{
	public int[] copyArr(int [] arr1){
		int arr2[] = new int[arr1.length];
		for(int i = 0;i < arr1.length;i++){
			arr2[i] = arr1[i];
		}
	return arr2;	
	}
}