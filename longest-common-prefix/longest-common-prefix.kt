class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var n = strs.size
        var i = 1
        var j = 0
        var ans = strs[0]
        var str1 = strs[0]
        var tmp = ""
        var l1 = str1.length
        var l2 = 0
        while(i < n){
            j = 0
            l2 = 0
            tmp = strs[i]
            while(j < tmp.length){
               if(j < str1.length && str1[j] == tmp[j]){
                  l2++
                  j++
               }
               else
                break
            }
            if(l2 < l1)
                l1 = l2
            i++
        }
        return ans.substring(0, l1)
        //Returns the substring of this string starting at the startIndex and ending right before the endIndex.
    }
}