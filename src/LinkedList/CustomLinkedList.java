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
    }

    private Entry head;

    public void addBack(E element) {
        if (head == null) {
            head = new Entry(element);
        } else {
            head.addBack(element);
        }
    }
}