package NGAYBAY.animal;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }
    public Circle(double r){
        this.radius = r;
    }

    public Circle(double v, String indigo, boolean b) {

    }

    public double getRadius() {
        return radius;
    }



    public double getArea() {
        return Math.pow(radius,2)*Math.PI;
    }


}
