package animal;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public Cat(Cat cat) {
        super(cat.name);   
    }

    @Override
    protected String getSound() {
        return "bruh";
    }

    public void beStubborn() {
        // joe
    }

    @Override
    public Object clone() {
        return new Cat(this);
    }

    

    
}