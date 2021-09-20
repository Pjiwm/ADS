package animal;

public abstract class Animal implements Cloneable {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(getSound());
    }

    protected abstract String getSound();

    abstract public Object clone();
    
}
