package animal;

public class Dog extends Animal implements Comparable<Dog> {
    private int age;

    public Dog(String name, int age) {
        super(name);
        this.age = age;
        // TODO Auto-generated constructor stub
    }

    public Dog(Dog dog) {
        super(dog.name);
    }

    @Override
    protected String getSound() {
        // TODO Auto-generated method stub
        return "woof";
    }

    public void beAGoodBoy() {
        // joe
    }

    @Override
    public Object clone() {
        // TODO Auto-generated method stub
        return new Dog(this);
    }

    @Override
    public int compareTo(Dog o) {
        if (this.age - o.age == 0) {
            return this.name.compareTo(o.name);
        }
        return this.age - o.age;
    }
}