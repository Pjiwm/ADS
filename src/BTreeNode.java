public class BTreeNode<T extends Comparable<T>> {
    private BTreeNode<T> left;
    private BTreeNode<T> right;
    private T value;

    public BTreeNode(T value) {
        this.value = value;
    }

    public void insert(T t) {
        if (this.value.compareTo(t) < 0) {
            if (this.right == null) {
                this.right = new BTreeNode<T>(t);
            } else {
                this.right.insert(t);
            }
        } else {
            if (this.left == null) {
                this.left = new BTreeNode<T>(t);
            } else {
                this.left.insert(t);
            }
        }
    }

    public boolean contains(T t) {
        if (this.value.compareTo(t) == 0) {
            return true;
        } else if (this.value.compareTo(t) < 0 && this.right != null) {
            // right
            return right.contains(t);
        } else if (this.value.compareTo(t) > 0 && this.left != null) {
            // left
            return left.contains(t);
        }

        return false;
    }

    private void callChildren(StringBuilder sb) {

        if (left != null)  left.callChildren(sb);
        sb.append(value + " ");
        if (right != null) right.callChildren(sb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        callChildren(sb);
        return sb.toString();
    }

}
