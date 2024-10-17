import java.util.ArrayList;

public class p38 {
    private ArrayList<Object> list;

    public p38() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        if (isEmpty()) {
            return null; 
        }
        return list.get(list.size() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            return null; 
        }
        return list.remove(list.size() - 1);
    }

    public void push(Object o) {
        list.add(o);
    }

    public static void main(String[] args) {
        p38 stack = new p38();
        stack.push(1);
        stack.push(2);
        stack.push(5);
        System.out.println("SIZE : "+stack.getSize()); 
        System.out.println("PEEK : "+stack.peek());
        stack.pop();
        System.out.println("After Pop : " + stack.getSize());
    }
}