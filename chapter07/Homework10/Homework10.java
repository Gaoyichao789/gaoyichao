package Homework10;

public class Homework10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("一发居士",23,"星际指挥官","男",5566);
        Doctor doctor2 = new Doctor("一发居士",23,"星际指挥官","沃尔玛塑料袋",5566);
        Doctor doctor3 = new Doctor("一发居士",23,"星际指挥官","男",5566);
        System.out.println(doctor1.equals(doctor3));
    }
}
