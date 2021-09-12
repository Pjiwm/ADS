package IStack;
import java.util.ArrayList;
import java.util.List;

public class ListStack implements IStack {
    private List<Integer> mem = new ArrayList<Integer>();

    @Override
    public void push(int num) {
        mem.add(num);
    }

    @Override
    public int pop() {
        return mem.remove(mem.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return mem.isEmpty();
    }
    
}
