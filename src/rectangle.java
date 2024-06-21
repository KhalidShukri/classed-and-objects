public class rectangle {
//    Fields
    private double width;
    private double length;
//    Constructor
    public rectangle(double length,double width){
      this.length = length;
      this.width = width;

    }
//    methods
    public  double getArea() {
        return length * width;

    };
    public double getPerimeter () {
        return  2 * (length + width);
    }




}
