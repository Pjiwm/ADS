package priorityqueue;

import java.util.LinkedList;

public class PriorityQueue<T extends Comparable> {
    private LinkedList<T> list;

    public PriorityQueue() {
        list = new LinkedList<>();

    }

    public boolean add(T t) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(t) > 0) {
                this.list.add(i, t);
            }
        }

        return true;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++) {
            sb.append( i+1 + " ."+ list.get(i).toString()+"\n");
        }
        return sb.toString();
    }

}