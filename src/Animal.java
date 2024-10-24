public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void  makeSound(){
        System.out.println("animal make sound.");
    }

    public void displayInfo(){
        System.out.println("name of the animal: " + name);
        System.out.println("age of the animal: " + age);
    }
}
