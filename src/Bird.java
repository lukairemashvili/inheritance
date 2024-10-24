public class Bird extends Animal{
    public Bird(String name, int age){
        super(name,age);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }

    @Override
    public void displayInfo() {
        System.out.println("Bird: " + name);
        System.out.println("Age: " + age);
    }
}
