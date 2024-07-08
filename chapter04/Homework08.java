public class Homework08 {

	public static void main(String[] args) {
		double sum = 0;
		for(int i = 1;i <= 100;i++){
			sum = sum + Math.pow(-1,i + 1) / i;
		}
		System.out.println(sum);
	}
}