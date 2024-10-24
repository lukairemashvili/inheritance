public class Cat extends Animal{
    public Cat(String name, int age){
        super(name,age);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void displayInfo() {
        System.out.println("Cat: " + name);
        System.out.println("Age: " + age);
    }
}
