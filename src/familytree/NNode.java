package familytree;

import java.util.List;

public class NNode<T> {
    private T value;
    private T left, right;

    public NNode(T value) {
        this.value = value;
    }

    public void insert(T left, T right) {
        this.left = left;
        this.right = right;
    }
}