public class Homework09 {

	public static void main(String[] args) {
		int t_sum = 0;
		for(int i = 1;i <= 100;i++){
			int sum = 0;
			for(int j = 1;j <= i;j++){
				sum = sum + j;
			}
			t_sum = t_sum + sum;
		}
		System.out.println(t_sum);
	}
}