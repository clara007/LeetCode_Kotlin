/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var list = head
        var fakeHead = ListNode(0)
        var ans = fakeHead
        if (head == null)
            return null
        fun recurse(l1 : ListNode?) {
            var l2 = l1
            if (l2?.next == null) {
                ans.next = l2
                return
            }
            recurse(l2.next)
            l2.next.next = l2
            l2.next = null
        }
        recurse(list)
        return fakeHead.next
        
    }
}