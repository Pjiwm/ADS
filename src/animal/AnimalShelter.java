package animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter<T extends Animal>{
    private List<T> animals;

    public AnimalShelter() {
        this.animals = new ArrayList<T>();
    }

    public void add(T animal) {
        animals.add(animal);
    }

    public void cacophony() {
        for (T animal : animals) {
            animal.makeSound();
        }
    }
}