package medium;

/*

2. Add Two Numbers

Link: https://leetcode.com/problems/add-two-numbers/
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.



Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]


Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.


*/
public class AddTwoNumbers2 {

    public static void main(String[] args) {
        ListNode node20 = new ListNode(1);
        ListNode node19 = new ListNode(1, node20);
        ListNode node18 = new ListNode(1, node19);
        ListNode node17 = new ListNode(1, node18);
        ListNode node16 = new ListNode(1, node17);
        ListNode node15 = new ListNode(1, node16);
        ListNode node14 = new ListNode(1, node15);
        ListNode node13 = new ListNode(1, node14);
        ListNode node12 = new ListNode(1, node13);
        ListNode node11 = new ListNode(1, node12);

        ListNode node0 = new ListNode(1, node11);
        ListNode node9 = new ListNode(1, node0);
        ListNode node8 = new ListNode(1, node9);
        ListNode node7 = new ListNode(1, node8);
        ListNode node6 = new ListNode(1, node7);
        ListNode node5 = new ListNode(1, node6);
        ListNode node4 = new ListNode(1, node5);
        ListNode node3 = new ListNode(1, node4);
        ListNode node2 = new ListNode(1, node3);
        ListNode node1 = new ListNode(1, node2);

        AddTwoNumbers2 addTwoNumbers = new AddTwoNumbers2();
        ListNode node = addTwoNumbers.addTwoNumbers(node1, node20);
        System.out.print("[");
        System.out.print(node.val);

        while (node.next != null){

            System.out.print(node.next.val);
            node = node.next;
        }
        System.out.print("]");
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersWithLeft(l1, l2, 0);

    }

    public ListNode addTwoNumbersWithLeft(ListNode l1, ListNode l2, int left) {
        if(l1 == null && l2 == null) return left == 1 ? new ListNode(1) : null;


        ListNode curr = new ListNode();

        int val1 = l1 != null ? l1.val : 0;
        int val2 = l2 != null ? l2.val : 0;


        int sum = val1 + val2 + left;
        curr.val = sum > 9 ? sum -10 : sum;
        left = sum > 9 ? 1 : 0;

        curr.next = addTwoNumbersWithLeft(l1 != null ? l1.next : null,
                l2 != null ? l2.next : null,
                left);
        return curr;
    }
}
