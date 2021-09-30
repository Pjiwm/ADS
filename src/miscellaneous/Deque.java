package miscellaneous;
import java.util.LinkedList;

public class Deque<T> {
    private LinkedList<T> queue;

    public Deque() {
        this.queue = new LinkedList<T>();
    }

    public T dequeueFront() {
        return queue.removeFirst();
    }

    public void enqueuFront(T t) {
        queue.addFirst(t);
    }

    public T dequeuBack() {
       return queue.removeLast();
    }

    public void enqueuBack(T t) {
        queue.addLast(t);
    }

    public T peekFront() {
        return queue.getFirst();
    }

    public T peekBack() {
        return queue.getLast();
    }

    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public int size() {
        return queue.size();
    }
}