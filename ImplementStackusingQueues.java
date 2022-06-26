import java.util.ArrayDeque;
import java.util.Queue;

public class ImplementStackusingQueues {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new ArrayDeque<Integer>();
        q2 = new ArrayDeque<Integer>();
    }

    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
            q2.remove();
        }
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
            q1.remove();
        }

    }

    public int pop() {
        int res = q1.peek();
        q1.remove();
        return res;
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    // optimal Soln
    public MyStack() {
        q1 = new ArrayDeque<Integer>();
        
    }

    public void push(int x) {
        q1.add(x);
        for (int i = 0; i < q1.size() - 1; i++) {
            q1.add(q1.poll());
        }
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
