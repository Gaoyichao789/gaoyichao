package Homework09;

public class LabeledPoint extends Point{
    private String Label;

    public LabeledPoint(double xPoint, double yPoint, String label) {
        super(xPoint, yPoint);
        Label = label;
    }
}
