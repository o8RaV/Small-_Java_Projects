import java.util.*;
public class queue {
    public static void main(String[] args) {
        queue temp = new queue();
        Boolean a = temp.is_empty();
        System.out.println(a);
        temp.enqueue(1);
        temp.enqueue(99);
        temp.enqueue(77);
        temp.enqueue(2);
        int b = product_star(temp);
        System.out.println(b);
        int i = temp.dequeue();
        i = temp.dequeue();
        System.out.println(i);
        b = product(temp);
        System.out.println(b);
    }

    ArrayList<Integer> _items;

    queue() {
        this._items = new ArrayList<>();
    }
    public Boolean is_empty() {
        return this._items.isEmpty();
    }
    public void enqueue(int item) {
        this._items.add(item);
    }
    public int dequeue() {
        Object removed = this._items.remove(0);
        int i = (int) removed;
        return i;
    }
    static int product(queue queue) {
        if (queue.is_empty()) {
            return 0;
        }
        int a = 1;
        while (!queue.is_empty()) {
            a = a * queue.dequeue();
        }
        return a;
    }
    static int product_star(queue queue) {
        int a = 1;
        queue temp = new queue();
        if (queue.is_empty()) {
            return 0;
        }
        while (!queue.is_empty()) {
            int i = queue.dequeue();
            a = a * i;
            temp.enqueue(i);
        }
        while (!temp.is_empty()) {
            queue.enqueue(temp.dequeue());
        }
        return a;
    }

}
