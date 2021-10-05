package familytree;

import java.util.LinkedList;
import java.util.List;

public class NNode<T> {
    private T self;
    private T partner;
    private List<NNode<T>> children;

    public NNode(T self) {
        this.self = self;
        this.children = new LinkedList<>();
    }

    public void addPartner(T partner) {
        this.partner = partner;
    }

    public void addKid(NNode<T> child) {
        this.children.add(child);
    }

    public T getSelf() {
        return this.self;
    }

    public T getPartner() {
        return this.partner;
    }

    public List<NNode<T>> getChildren() {
        return this.children;
    }

}