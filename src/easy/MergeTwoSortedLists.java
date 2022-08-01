package easy;

import java.util.Stack;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        ListNode l13 = new ListNode(4);
        ListNode l12 = new ListNode(2, l13);
        ListNode l11 = new ListNode(1, l12);

        ListNode l23 = new ListNode(4);
        ListNode l22 = new ListNode(3, l23);
        ListNode l21 = new ListNode(1, l22);

        ListNode node = mergeTwoLists(l11, l21);
        System.out.println(node.toString());
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}

