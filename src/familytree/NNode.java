package familytree;

import java.util.LinkedList;
import java.util.List;

public class NNode<T> {
    private T father;
    private T mother;
    private List<NNode<T>> children;

    public NNode(T father, T mother) {
        this.father = father;
        this.mother = mother;
        this.children = new LinkedList<>();
    }

    public void insert(LinkedList<NNode<T>> children) {
        this.children = children;
    }


    public T getFather() {
        return this.father;
    }

    public T getMother() {
        return this.mother;
    }

    public List<NNode<T>> getChildren() {
        return this.children;
    }

}