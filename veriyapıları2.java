import java.util.Stack;

public class veriyapıları2 {

    static class Kuyruk {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        void enqueue(int value) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
            st1.push(value);
            while (!st2.isEmpty()) {
                st1.push(st2.pop());
            }
        }

        int dequeue() {
            if (st1.isEmpty()) {
                throw new RuntimeException("Kuyruk boş!");
            }
            return st1.pop();
        }
    }

    public static void main(String[] args) {
        Kuyruk k1 = new Kuyruk();
        k1.enqueue(8);
        k1.enqueue(9);
        int z = k1.dequeue();
        System.out.println(z);  // 8 yazdırır
    }
}

