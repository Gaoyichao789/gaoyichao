public class Homework06 {

	public static void main(String[] args) {
		int j = 0;
		for(int i = 1;i <= 100;i++){
			if(i % 5 != 0){
				System.out.print(i + "\t");
				j = j + 1;
			}
			if (j == 5){
				System.out.print("\n");
				j = 0;
			}
		}
	}
}