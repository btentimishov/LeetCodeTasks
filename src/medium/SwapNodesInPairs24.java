package medium;

import java.util.Stack;

public class SwapNodesInPairs24 {
    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;


        if (head.next != null) {
            ListNode temp = head;
            head = head.next;
            temp.next = head.next;
            head.next = temp;

            head.next.next = swapPairs(head.next.next);
        }


        return head;


    }

    public boolean isPalindrome(ListNode head) {

        ListNode end = head;
        Stack<ListNode> stack = new Stack<>();
        while (end != null) {
            stack.push(end);
            if (stack.peek() == end) {
                stack.pop();
            } else {
                return false;
            }
            end = end.next;
        }
        return false;

    }
}
