package animal;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    public Cat(Cat cat) {
        super(cat.name);   
    }

    @Override
    protected String getSound() {
        // TODO Auto-generated method stub
        return "bruh";
    }

    public void beStubborn() {
        // joe
    }

    @Override
    public Object clone() {
        // TODO Auto-generated method stub
        return new Cat(this);
    }

    

    
}