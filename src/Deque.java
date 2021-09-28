import java.util.LinkedList;

public class Deque<T> {
    private LinkedList queue;

    public Deque() {
        this.queue = new LinkedList<T>();
    }

    public T dequeueFront() {
        T front = (T) queue.getFirst();
        queue.removeFirst();
        return front;
    }

    public void enqueuFront(T t) {
        queue.addFirst(t);
    }

    public T dequeuBack() {
        T back = (T) queue.getLast();
        queue.removeLast();
        return back;
    }

    public void enqueuBack(T t) {
        queue.addLast(t);
    }

    public T peekFront() {
        return (T) queue.getFirst();
    }

    public T peekBack() {
        return (T) queue.getLast();

    }

    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public int size() {
        return queue.size();
    }
}