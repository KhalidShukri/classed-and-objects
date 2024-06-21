public class Circle1 extends Shape {
    private double Radius;
    public Circle1 (double Radius) {
        this.Radius = Radius;
    }
    @Override
        double getarea () {
            return Math.PI * Radius * Radius;
        }
    @Override
    double getVolume() {

        return 0;
    }

    @Override
    double getSurfacearea() {
        return Math.PI * Radius * Radius * 4;
    }
    }

