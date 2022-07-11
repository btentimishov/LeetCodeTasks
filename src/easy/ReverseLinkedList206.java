package easy;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList206 {

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ReverseLinkedList206 rev = new ReverseLinkedList206();
        rev.reverseList(node1);
    }


    ListNode reverseList(ListNode head) {

        if (head.next == null) return head;
        int counter = 1;
        ListNode node = head;
        do {
            counter++;
            node = node.next;
        } while (node.next != null);
        int middle = (counter / 2) + 1;

        for (int i = 0; i < middle; i++) {
            if (i == middle -1) return head;
            head = head.next;
        }
        return head;


//        if (head == null) return null;
//        System.out.println(head.val);
//
//        return reverseList(head.next);
//        if (head == null) return null;
//
//        if (head.next != null) {
//
//            medium.ListNode gotNode = reverseList(head.next);
//            gotNode.next = head;
//
//            return gotNode;
//        }
    }

//    private medium.ListNode reverseList2(medium.ListNode head, medium.ListNode prev) {
////        if (head.next == null) {
////            return head;
////        }
////
////        head = reverseList2(head.next, prev);
////
//
///*                if(head.next == null) {
//            return prev;
//        }
//
//        head.next = reverseList2(head.next, head).next;
//        return head;
//                if(head.next == null) {
//            head.next = prev;
//            return head;
//        }
//
//        head = reverseList2(head.next, head).next;
//        head.next = prev;
//
//        return head;*/
//    }

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
//}