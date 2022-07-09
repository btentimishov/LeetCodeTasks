package medium;


/*
19. Remove Nth Node From End of List

Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/

Given the head of a linked list, remove the nth node from the end of the list and return its head.



Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]


Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz


*/
public class RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {

        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5/*, node6*/);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);



        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();

        ListNode node = removeNthNodeFromEndOfList.removeNthFromEnd(node1, 2);
        removeNthNodeFromEndOfList.logListNode(node);


    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        //if head node has no 'next' value, than we adjust head node to null
        if (head.next == null) return null;

        //at first, we have to find the last node and index of the last node
        int indexOfLastNode = searchLastIndex(head, 1);
        System.out.println("indexOfLastNode: " + indexOfLastNode);


        //we also should find (n+1)th node from the end
        ListNode nPlusOneThNode = findNodeByIndex1(head, indexOfLastNode - n);
        System.out.print("nPlusOneThNode: ");
        logListNode(nPlusOneThNode);



        //then we have to find (n)th node from the end.
        ListNode nThNode = nPlusOneThNode.next;


        //to remove (n)th node from the end, we should adjust (n-1)th node form the end to the 'next' value of (n+1)th node form the end
        nPlusOneThNode.next = nThNode.next;


//        medium.ListNode newHead = new medium.ListNode();
//        for (int i = 1; i <= indexOfLastNode - n; i++) {
//
//        }
        //we also have to check for existence of (n)th, (n+1)th and (n-1)th node from the end

        return nPlusOneThNode;
    }

    private void removeNode(){

    }
    public ListNode findNodeByIndex(ListNode head, int index){
        ListNode node = new ListNode();
        for (int i = 1; i <= index; i++) {
            if (i == 1) node = head;
            else node = head.next;
        }
        return node;
    }

    public ListNode findNodeByIndex1(ListNode head, int index){
        if (index == 0
        ) return head;
        else return findNodeByIndex1(head.next, --index);
    }

    public ListNode searchLastNode(ListNode head) {
        if (head == null)
            return head;

        if (head.next != null)
            return searchLastNode(head.next);
        else return head;
    }

    public int searchLastIndex(ListNode head, int index) {
        if (head == null)
            return -1;
        if (head.next != null)
            return searchLastIndex(head.next, ++index);
        else return index;
    }



    private void logListNode(ListNode node) {
        System.out.print("[" + node.val);
        while (node.next !=null){
            System.out.print(" " + node.next.val);
            node = node.next;
        }
        System.out.println("]");

    }

}