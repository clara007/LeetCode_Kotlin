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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var list1 = l1
        var list2 = l2
        var ansHead = ListNode(0)
        var ans = ansHead
        var sum = 0
        var tmp = 0
        while(list1 != null && list2 != null){
            sum = tmp + list1.`val` + list2.`val`
            ans.next = ListNode(sum % 10)
            ans = ans.next
            list1 = list1.next
            list2 = list2.next
            if(sum >= 10)
                tmp = 1
            else
                tmp = 0
            sum = 0
        }
        while(list1 != null){
            sum = tmp + list1.`val`
            ans.next = ListNode(sum % 10)
            ans = ans.next
            list1 = list1.next
            if(sum >= 10)
                tmp = 1
            else 
                tmp = 0
            sum = 0
        }
        while(list2 != null){
            sum = tmp + list2.`val`
            ans.next = ListNode(sum % 10)
            ans = ans.next
            list2 = list2.next
            if(sum >= 10)
                tmp = 1
            else
                tmp = 0
            sum = 0
        }
        if(tmp == 1){
            ans.next = ListNode(tmp)
            ans = ans.next
        }
        return ansHead.next
    }
}