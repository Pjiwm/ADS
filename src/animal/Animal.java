package animal;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(getSound());
    }

    protected abstract String getSound();
    
}
