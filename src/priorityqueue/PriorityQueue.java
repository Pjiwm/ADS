package priorityqueue;

import java.util.LinkedList;

public class PriorityQueue<T extends HTTPRequest> {
    private LinkedList<T> list;

    public PriorityQueue() {
        list = new LinkedList<>();

    }

    public boolean add(T t) {
        if (list.isEmpty()) {
            list.add(t);
            return true;
        }

        int i = 0;
        while(i < list.size()) {
            if(t.compareTo(list.get(i)) < 0) {
                list.add(i, t);
                return true;
            }
            i++;
        }

        list.add(t);
        return true;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = list.size()-1; i >= 0; i--) {
            sb.append( list.size()-i + ". "+ list.get(i).toString()+"\n");
        }
        return sb.toString();
    }

}