public class Homework09 {

	public static void main(String[] args) {
		Music music1 = new Music("���˽�����",5.2);
		music1.show();
	}
}

class Music{
	String name;
	double time;
	public Music(String name,double time){
		this.name = name;
		this.time = time;
	}
	public void show(){
		System.out.println("������ϢΪ" + name + time);
	}
}