public class Main {
    public static void main(String[] args) {
//        Create a rectangle class instances/objects
//        Syntax
//        ClassType objname = new classType(istancevariables)
        rectangle rect1 = new rectangle(5.0,3.0);
//        syntax
//        objname.methodname
//        onjname.fieldname()

        double area = rect1.getArea();
        double perimeter = rect1.getPerimeter();

        System.out.println("The area of the Rectangle= " + area);
        System.out.println("The area of the Rectangle= " + perimeter);

//Create a Person object
        Person Khalid = new Person();
        System.out.println(Khalid.getName());
        System.out.println(Khalid.getAge());
        Khalid.sayHello();
        Person fred = new Person("Fred Makau",26);
       fred.sayHello();
       Person Kinsi = new Person("Kinsi Shukri",20);
       Kinsi.sayHello();

       circle circ1 = new circle(7.0);
       double circumference = circ1.Circumference();
       double area2 = circ1.Area();
        System.out.println("Area of the Circle " + area2);
        System.out.println("Circumference of the Circle " + circumference);
        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        animal.makeSound();
        dog.makeSound();
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(4,3));
        System.out.println(calculator.add(4,3,7));



        Car mycar = new Car();
        mycar.start();
        mycar.stop();

        Circle1 circ2 = new Circle1(7.0);
        System.out.println(circ2.getarea());
        circ2.printArea();


       sphere Sphere = new sphere(5.0);
        Sphere.printVolume();
        Sphere.printSurfaceArea();
    }
}