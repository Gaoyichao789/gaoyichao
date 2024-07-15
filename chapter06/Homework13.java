public class Homework13 {

	public static void main(String[] args) {
		Circle c = new Circle();
		PassObject po = new PassObject();
		po.printAreas(c,5);
	}
}

class Circle{
	double radius;
	public double findArea(){
		double area = Math.PI * Math.pow(radius,2);
		return area;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
}
class PassObject{
	public void printAreas(Circle c,int times){
		System.out.println("radius\tarea");
		for(int i = 1;i <= times;i++){
			c.setRadius(i);
			System.out.println(i + "\t" + c.findArea());
		}
	}
}