import java.util.*;

public class tree {
    public static void main(String[] args) {
        tree test = new tree(null);
        List item = new ArrayList<>(); item.add(1); item.add(2); item.add(3);item.add(4); item.add(5);item.add(6);
        test.maker(item);
        System.out.println(test.val);
    }
    tree left; tree right; Object val;

    tree(Object it) {
        if (it == null) {
            this.val = null;
            this.left = null;
            this.right = null;
        }
        else {
            this.val = it;
            this.left = new tree(null);
            this.right = new tree(null);
        }
    }

    tree maker(List items) {
        if (items.size() <= 0) {
            return this;
        }
        else {
            this.val = items.get(0);
            this.left = maker(items.subList(1, items.size()/2));
            this.right = maker(items.subList(items.size()/2 + 1, items.size() - 1));
            return this;
        }
    }
}
