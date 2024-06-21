public class Person {
//    Fields
    private String name;
    private int age;
//    Default Constructor
    public Person () {
        this.name = "unknown";
        this.age  = 0;
    }


    public Person(String name,int age) {
        this.name = name;
        this.age = age;

    }

//    Methods
    public void sayHello() {
        System.out.println("Hello, My name is " + name + " and i'm " + age + " Years old. ");

    }

    public void setName (String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age){
        this.age = age;

    }
    public int getAge(){
        return age;
    }


}
