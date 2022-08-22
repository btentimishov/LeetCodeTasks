package easy;

public class LowestCommonAncestorOfABinarySearchTree235 {
    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val == p.val || root.val == q.val) {
            return root;
        }

        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }

        return root;
    }


    public ListNode swapPairs(ListNode head) {
        return helper(head, true);
    }


    public ListNode helper(ListNode head, boolean toChange) {

        if (head.next == null) return head;

        if (!toChange) {
            head.next = helper(head.next, true);
            return head;
        }


        ListNode temp = head;
        ListNode next = head.next;
        temp.next = next.next;

        head = head.next;
        head.next = temp;

        head.next = helper(head.next, false);


        return head;
    }
}
