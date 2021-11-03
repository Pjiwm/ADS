import java.util.LinkedList;
import java.util.List;

class ListNode<T> implements Cloneable {
    private ListNode next;
    private T data;

    public ListNode(ListNode previous, T data) {
        if (previous != null)
            previous.next = this;
        this.data = data;
    }

    // copy constructor
    public ListNode(ListNode copy) {
        ListNode current = copy.next;
        this.data = (T) copy.data;
        this.next = null;
        while (current != null) {
            this.insert((T) current.data, null);
            current = current.next;
        }

    }
    /**
     * helaas niet gelukt om binnen de tijd waarden tussen 1e en laatste node toe te voegen. Hij heschrijft nu steeds de 2e Node
     * waardoor de 2e node de laatste waarde is van de originele node, ipv dat hij steeds een nieuwe next node er aan vast plakt.
     */
    public void insert(T data, ListNode last) {
        if (this.next != null) {
            this.next.insert(data, this);
        } else {
            this.next = new ListNode(last, data);
        }
    }

    public void replaceAt(int index, T newData) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index does not exist");
        } else if (index == 0) {
            data = newData;
        } else {
            next.replaceAt(index - 1, newData);
        }
    }

    @Override
    public String toString() {
        if (next != null) {
            return String.format("%s, %s", data.toString(), next.toString());
        } else {
            return data.toString();
        }
    }

    @Override
    public ListNode clone() {
        return new ListNode(this);
    }

}