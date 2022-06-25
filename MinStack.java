import java.util.Stack;

public class MinStack {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        if (min.isEmpty() || min.peek() > x) {
            min.push(val);
        }
        s.push(val);
    }

    public void pop() {
        if (min.peek().equals(s.peek())) {
            min.pop();
        }
        s.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
