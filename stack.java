import java.util.*;
public class stack {
    public static void main(String[] args) {
        stack test = new stack();
        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        test.push(5);
        test.push(6);
        int a = size(test);
        int b = test.pop();
        System.out.println(a + " " + b);
    }
    ArrayList<Integer> _items;
    stack() {
        this._items = new ArrayList<>();
    }
    Boolean is_empty() {
        return this._items.isEmpty();
    }
    void push(int item) {
        this._items.add(item);
    }
    int pop() {
        int removed  = this._items.remove(this._items.size() - 1);
        return removed;
    }
    static int size(stack stack) {
        int size = 0;
        stack temp = new stack();
        while (!stack.is_empty()) {
            temp.push(stack.pop());
            size = size + 1;
        }
        while (!temp.is_empty()) {
            stack.push(temp.pop());
        }
        return size;
    }
    static void remove_big(stack stack) {
        stack temp = new stack();
        while (!stack.is_empty()) {
            int i = stack.pop();
            if (i < 5) {
                temp.push(i);
            }
        }
        while (!temp.is_empty()) {
            stack.push(temp.pop());
        }
    }
    static stack double_stack(stack stack) {
        stack returning = new stack();
        stack temp = new stack();
        while (!stack.is_empty()) {
            int i = stack.pop();
            returning.push(i);
            returning.push(i);
            temp.push(i);
        }
        while (!temp.is_empty()) {
            stack.push(temp.pop());
        }
        return returning;
    }
    static void insert_at_bottom(stack stack, int item) {
        stack temp = new stack();
        while (!stack.is_empty()) {
            temp.push(stack.pop());
        }
        temp.push(item);
        while (!temp.is_empty()) {
            stack.push(temp.pop());
        }
    }
}
