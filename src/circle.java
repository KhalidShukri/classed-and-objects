public class circle {
    private double radius;

    public circle(double radius){
        this.radius = radius;

    }
    public double Circumference () {
        return (22*radius * 2)/7;
    }
    public double Area(){
        return (22* radius*radius)/7;
    }

}

