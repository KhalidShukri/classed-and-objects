public class sphere extends Shape {
    private double radius;

    public sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double getarea() {
        return 0;
    }

    @Override
    double getVolume() {

        return Math.PI * radius * radius * radius * 4 / 3;
    }

    @Override
    double getSurfacearea() {
        return Math.PI * radius * radius * 4;
    }
}

