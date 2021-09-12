package IStack;
import java.util.EmptyStackException;

public class ArrayStack implements IStack {
    private int[] mem = new int[0]; 

    @Override
    public void push(int num) {
        int[] newMem = new int[mem.length + 1];

        for(int x = 0; x < mem.length; x++) {
            newMem[x] = mem[x];
        }  

        newMem[newMem.length -1] = num;
        mem = newMem;
    }

    @Override
    public int pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }


        int[] newMem = new int[mem.length -1];

        for(int x = 0; x < newMem.length; x++) {
            newMem[x] = mem[x];
        }
        
        int poppedValue = mem[mem.length -1];
        mem = newMem;
        return poppedValue;
    }

    @Override
    public boolean isEmpty() {
        return mem.length == 0;
    }
    
}
