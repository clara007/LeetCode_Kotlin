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
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var listLength = 0
        var nodePosition = 0
        var ansHead = ListNode(0)
        var ans = ansHead
        var tmpList = head
        while(tmpList != null){
            tmpList = tmpList.next
            listLength++
        }
        nodePosition = listLength - n
        listLength = 0
        tmpList = head
        if(nodePosition == 0)
            return head?.next
        while(tmpList != null){
            ans.next = ListNode(tmpList.`val`)
            ans = ans.next
            listLength++
            if(listLength == nodePosition)
                tmpList = tmpList.next.next
            else
                tmpList = tmpList.next
        }
        return ansHead.next
    }
}