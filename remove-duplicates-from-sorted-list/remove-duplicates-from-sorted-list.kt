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
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var fakeHead = ListNode(0)
        var ansHead = fakeHead
        var theHead = head
        var tmp = 0
        while (theHead != null) {
            tmp = theHead.`val`
            if (theHead?.next != null && theHead?.next.`val`!! == tmp) {
                while (theHead?.next != null && theHead?.next.`val` == tmp) {
                    theHead = theHead.next
                }
            }
            else {
                ansHead.next = ListNode(tmp)
                ansHead = ansHead.next
                theHead = theHead.next
            }
        }
        return fakeHead.next
    }
}