public class Homework01 {

	public static void main(String[] args) {
		int money = 100000;
		int number = 0;
		while (money >= 1000){
			if (money > 50000){
				money = (int)(money * 0.95);
			}
			else {
				money = money - 1000;
			}
			number = number + 1;
		}
		System.out.print("经过次数为"+number);
	}
}