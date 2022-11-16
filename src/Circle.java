public class Circle {
    private double radius;
    public static final double PI = 3.14;

    public Circle(){
        this(1);
    }
    public Circle(double myRadius){
        this.radius = myRadius;
    }
    public double computeArea(){
        return Math.PI * Math.pow(this.radius,2);
    }
}
