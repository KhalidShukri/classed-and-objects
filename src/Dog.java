public class Dog extends Animal {
    public void bark() {
        System.out.println("Woof!Woof!");
    }
//    Method Overriding
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }


}
