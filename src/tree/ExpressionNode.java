package tree;
public class ExpressionNode<T> {
    private T value;
    private ExpressionNode<T> left;
    private ExpressionNode<T> right;

    public ExpressionNode(T value) {
        this.value = value;
    }

}