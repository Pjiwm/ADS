package linkedlist;

public class CustomLinkedList<E> {

    class Entry {
        private E element;
        private Entry next;
        private Entry previous;

        public Entry(E element) {
            this.element = element;
        }

        public void addBack(E _element) {

            if (this.next == null) {
                this.next = new Entry(_element);
            } else {
                this.next.addBack(_element);
            }
        }

        public int count(int count) {

            if (this.next == null) {
                return count+1;
            } else {
                return this.next.count(count + 1);
            }
        }

        public void addFront(E newElement, int count) {
            // This caches the size of the array, so looking it up is only O(1)
            count++;
    
            // Create the new entry that contains the new element
            Entry newEntry = new Entry(newElement);
    
            if (head == null) {
                // If there is no head (first entry) yet, we simply point the head to it
                head = newEntry;
                tail = newEntry;
            } else {
                // Otherwise we hook the new entry in the chain at the front
                newEntry.next = head;
                head = newEntry;
                previous = newEntry;
            }
        }
    }

    private Entry head;
    private Entry tail;

    // public void addBack(E element) {
    //     if (head == null) {
    //         head = new Entry(element);
    //     } else {
    //         head.addBack(element);
    //     }
    // }
    public void addBack(E element) {
        Entry newEntry = new Entry(element);
        if(head == null) {
            head = newEntry;
            tail = newEntry;
        } else {
            // newEntry.previous =
        }
    }

    public int count() {
        if (head == null) {
            return 0;
        }
        return head.count(0);
    }

    public void addFront(E element) {
        head.addFront(element, 0);
    }
}