package animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter<T extends Animal> implements Cloneable, Comparable<T> {
    private List<T> animals;

    public AnimalShelter() {
        this.animals = new ArrayList<T>();
    }

    public AnimalShelter(AnimalShelter animals) {
        List<T> newAnimals = new ArrayList<>();
        for (Animal animal : this.animals) {
            newAnimals.add((T) animal.clone());
        }

        this.animals = newAnimals;
    }

    public void add(T animal) {
        animals.add(animal);
    }

    public void cacophony() {
        for (T animal : animals) {
            animal.makeSound();
        }
    }

    @Override
    public AnimalShelter clone() {

        return new AnimalShelter(this);
    }

    @Override
    public int compareTo(T o) {
        // TODO Auto-generated method stub
        return 0;
    }

}