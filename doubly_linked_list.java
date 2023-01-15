import java.util.*;

class _node {
    Object item; _node next; _node prev;
    _node(Object item) {
        this.item = item;
        this.prev = null;
        this.next = null;
    }
}

public class doubly_linked_list {
    
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(); list.add(0); list.add(1); list.add(2); list.add(4);list.add(5);
        doubly_linked_list test = new doubly_linked_list(list);
        System.out.println(test.__get_item__(2));
        test.insert_after(3, 2);
        System.out.println(test.__get_item__(3));
        System.out.println(" ");

        System.out.println(test._first.item);
        System.out.println(test._first.next.item);
        System.out.println(test._first.next.next.item);
        System.out.println(test._first.next.next.next.item);
        System.out.println(test._first.next.next.next.next.item);
        System.out.println(test._first.next.next.next.next.next.item);
        System.out.println(test._last.item);
        System.out.println(test._last.prev.item);
        System.out.println(test._last.prev.prev.item);
        System.out.println(test._last.prev.prev.prev.item);
        System.out.println(test._last.prev.prev.prev.prev.item);
        System.out.println(test._last.prev.prev.prev.prev.prev.item);
    }

    _node _first; _node _last;
    doubly_linked_list(ArrayList<Object> list) {
        if (list.isEmpty()) {
            this._first = null;
            this._last = null;
        }
        if (list.size() >= 2) {
            this._first = new _node(list.get(0));
            this._first.next = new _node(list.get(1));
            _node curr1 = this._first;
            for (Object i : list.subList(1, list.size())) {
                _node temp = curr1;
                curr1.next = new _node(i);
                curr1 = curr1.next;
                curr1.prev = temp;
            }
            this._last = curr1;
        }
        else {
            this._first = new _node(list.get(0));
            this._first.next = null;
            this._last = this._first;
        }
    }
    Boolean is_empty() {
        if (this._first != null) {
            return false;
        }
        return true;
    }
    Object __get_item__(int index) {
        int counter = 0;
        _node curr = this._first;
        while (counter != index) {
            curr = curr.next;
            counter = counter + 1;
        }
        return curr.item;
    }
    void insert(Object item, int index) {
        int counter = 0;
        _node curr = this._first;
        while (counter != index - 1) {
            curr = curr.next;
            counter = counter + 1;
        }
        _node to_insert = new _node(item);
        to_insert.next = curr.next;
        curr.next.prev = to_insert;
        curr.next = to_insert;
        to_insert.prev = curr;
    }
    int len() {
        int len = 0;
        _node curr = this._first;
        while (curr != null) {
            curr = curr.next;
            len = len + 1;
        }
        return len;
    }
    void insert_after(Object item, Object marker) {
        _node curr = this._first;
        while (curr.item != marker) {
            curr = curr.next;
        }
        _node to_insert = new _node(item);
        to_insert.next = curr.next;
        curr.next.prev = to_insert;
        curr.next = to_insert;
        to_insert.prev = curr;
        
    }
}
