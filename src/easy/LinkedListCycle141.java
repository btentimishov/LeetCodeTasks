package easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinkedListCycle141 {
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> map = new HashMap<>();

        while (head != null) {
            map.put(head, 0);
            ListNode next = head.next;
            if (next == null) return false;

            if (map.get(next) != null) return true;
            head = next;
        }

        return false;
    }
}
