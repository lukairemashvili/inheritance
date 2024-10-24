public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("luna", 3);
        Cat cat = new Cat("simba", 7);
        Bird bird = new Bird("chiko", 2);

        Animal[] animals = new Animal[3];
        animals[0] = dog;
        animals[1] = cat;
        animals[2] = bird;


        for (Animal animal : animals){
            animal.displayInfo();
            animal.makeSound();
        }

//        performAnimalSound(dog);
//        performAnimalSound(cat);
    }
    public static void performAnimalSound(Animal animal){
        animal.makeSound();
    }
}