package easy;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePreorderTraversal589 {
    public static void main(String[] args) {

    }
    public List<Integer> preorder(Node root) {
        if (root==null) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        if (root.children != null) {
            if (root.children.size() != 0) {
                for (int i = 0; i < root.children.size(); i++) {
                    list.addAll(preorder(root.children.get(i)));
                }
            }
        }
        return list;
    }
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
