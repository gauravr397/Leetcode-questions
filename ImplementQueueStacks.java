import java.util.Stack;

class ImplementQueueStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(x){
       s1.push(x);
    }

    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek() {
        if (!s2.isEmpty()) {
            return s2.peek();
        } else {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public boolean empty() {
        return s1.isempty() && s2.isEmpty();
    }
}