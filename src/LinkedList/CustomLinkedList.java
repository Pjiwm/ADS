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

        public void addFront(E element) {
            Entry newEntry = new Entry(element);
            if (head == null) {
                head = newEntry; 
            }
            newEntry.next = head;
            head = newEntry;
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
}