package LinkedList;

public class CustomLinkedList<E> {

    class Entry {
        private E element;
        private Entry next;

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

        public void AddFront(E newElement, int count) {
            // This caches the size of the array, so looking it up is only O(1)
            count++;
    
            // Create the new entry that contains the new element
            Entry newEntry = new Entry(newElement);
    
            if (head == null) {
                // If there is no head (first entry) yet, we simply point the head to it
                head = newEntry;
            } else {
                // Otherwise we hook the new entry in the chain at the front
                newEntry.next = head;
                head = newEntry;
            }
        }
    }

    private Entry head;

    public void addBack(E element) {
        if (head == null) {
            head = new Entry(element);
        } else {
            head.addBack(element);
        }
    }

    public int count() {
        if (head == null) {
            return 0;
        }

        return head.count(0);
    }

    public void addFront(E element) {
        head.AddFront(element, 0);
    }
}