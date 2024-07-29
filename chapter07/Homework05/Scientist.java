package Homework05;

public class Scientist extends Employee{
    private double YearBonus;
    public Scientist(double salary, double YearBonus) {
        super(salary);
        this.YearBonus = YearBonus;
    }

    public double getYearBonus() {
        return YearBonus;
    }

    public void setYearBonus(double yearBonus) {
        YearBonus = yearBonus;
    }

    @Override
    public void showSalary() {
        System.out.println(getSalary() + getYearBonus());
    }
}
