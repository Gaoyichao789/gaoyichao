import java.util.Scanner;
public class Homework02 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入要查找的字符:");
		char word = myScanner.next().charAt(0);
		char arr[] = {'a','b','c','d','e'};
		A02 a = new A02();
		System.out.println(a.find(word,arr));
	}
}

class A02{
	public int find(char findword,char arr1[]){
		for(int i = 0;i < arr1.length;i++){
			if(findword == arr1[i]){
				return i;
			}
		}
		return -1;
	}
}