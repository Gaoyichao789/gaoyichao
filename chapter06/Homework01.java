public class Homework01 {

	public static void main(String[] args) {
		double arr[] = {3.1,5.2,6.0,2.8};
		A01 a = new A01();
		System.out.println("最大值为" + a.max(arr));
	}
}

class A01{
	public double max(double arr1[]){
		double maxnum = arr1[0];
		for(int i = 0;i < arr1.length;i++){
			if(arr1[i] > maxnum){
				maxnum = arr1[i];
			}
		}
		return maxnum;
	}
}