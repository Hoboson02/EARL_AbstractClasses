import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<Animal>();
        zoo.add(new Pig());
        zoo.add(new Cow());
        for (Animal animal: zoo) {
            animal.animalSound();
            animal.sleep();
        }
    }
}