abstract class Shape {
    abstract double getarea();
    public void printArea (){
        System.out.println("The Area is: " + getarea());

    }
    abstract double getVolume();
    public void printVolume (){
        System.out.println("The Volume is: " + getVolume());

    }

    abstract double getSurfacearea();

    public void printSurfaceArea (){
        System.out.println("The Surface Area is: " + getSurfacearea());

    }


}
