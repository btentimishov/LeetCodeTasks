package easy;

public class MiddleOfTheLinkedList876 {
    public static void main(String[] args) {
        MiddleOfTheLinkedList876 m = new MiddleOfTheLinkedList876();
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        System.out.println(m.middleNode(node1).val);
    }

    public ListNode middleNode(ListNode head) {
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

    }
}
