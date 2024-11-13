import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> list;

    public MyStack() {
        list = new LinkedList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        return list.remove();
    }

    public int top() {
        return list.peek();
    }

    public boolean empty() {
        return list.isEmpty();
    }
}
