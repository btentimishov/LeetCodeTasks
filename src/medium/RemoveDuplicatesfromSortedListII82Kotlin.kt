package medium

class RemoveDuplicatesfromSortedListII82Kotlin {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var head = head
        if (head?.next == null) return head
        if (head.`val` != head.next.`val`) {
            head.next = deleteDuplicates(head.next)
            return head
        }
        val cur = head.`val`
        while (head != null) {
            if (head.`val` != cur) break
            head = head.next
        }
        return deleteDuplicates(head)
    }
}