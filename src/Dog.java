public class Dog extends Animal{
    public Dog(String name, int age){
        super(name,age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void displayInfo() {
        System.out.println("Dog: " + name);
        System.out.println("Age: " + age);
    }
}
