package easy;

import java.util.List;
/*
876. Middle of the Linked List

Link: https://leetcode.com/problems/middle-of-the-linked-list/

Given the head of a singly linked list, return the middle node of the linked list.

        If there are two middle nodes, return the second middle node.



        Example 1:


        Input: head = [1,2,3,4,5]
        Output: [3,4,5]
        Explanation: The middle node of the list is node 3.
        Example 2:


        Input: head = [1,2,3,4,5,6]
        Output: [4,5,6]
        Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.


        Constraints:

        The number of nodes in the list is in the range [1, 100].
        1 <= Node.val <= 100*/
public class MiddleOfTheLinkedList {


    public static void main(String[] args) {
        MiddleOfTheLinkedList middle = new MiddleOfTheLinkedList();

        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5/*, node6*/);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode node = middle.middleNode(node1);

        System.out.println("Val: " + node.val);
        System.out.println("Next: " + node.next.val);
    }

    public ListNode middleNode(ListNode head) {
        int index = search(head, 1);
        int mid = (index / 2) + 1;

        System.out.println("Index: " + index);
        System.out.println("mid: " + mid);

        ListNode node = new ListNode();
        for (int i = 0; i < mid; i++) {
            if (i == 0) node = head;
            else node = node.next;
        }
        return node;
    }

    public int search(ListNode head, int index) {
        if (head == null)
            return -1;

        if (head.next != null)
            return search(head.next, ++index);
        else return index;
    }

}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

