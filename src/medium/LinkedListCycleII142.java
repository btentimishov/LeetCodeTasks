package medium;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCycleII142 {
    public static void main(String[] args) {
        LinkedListCycleII142 l = new LinkedListCycleII142();

        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        node5.next = node2;
        System.out.println(l.detectCycle(node1).val);

    }
    public ListNode detectCycle(ListNode head) {

        if (head.next == null) return null;
        //[1, 2, 3, 4, 5]
        Map<ListNode, ListNode> mapOfNextAndHead = new HashMap<>();
        mapOfNextAndHead.put(head, null);
        do {
            if (mapOfNextAndHead.containsKey(head.next) && mapOfNextAndHead.get(head.next) !=null) {
                return head.next;
            } else {
                mapOfNextAndHead.put(head.next, head);
            }
            head = head.next;
        } while (head.next != null);

        return null;
    }


}
