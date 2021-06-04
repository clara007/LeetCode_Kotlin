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
        fakeHead.next = head
        var tmpHead = fakeHead
        var tmpValue = 0
        while (tmpHead.next != null && tmpHead.next.next != null) {
            if (tmpHead.next.`val` == tmpHead.next.next.`val`) {
                tmpValue = tmpHead.next.`val`
                while (tmpHead.next != null && tmpHead.next.`val` == tmpValue ) {
                    tmpHead.next = tmpHead.next.next
                }
            }
            else {
                tmpHead = tmpHead.next
            }
        }  
        return fakeHead.next    
    }
}