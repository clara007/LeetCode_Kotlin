class Solution {
    fun strStr(haystack: String, needle: String): Int {
        var tmp = 0
        var i = 0
        var j = 0
        if (needle == "")
            return 0
        if (needle.length > haystack.length)
            return -1
        while (i < haystack.length) {
            if (haystack[i] == needle[0]) {
                tmp = i
                j = 0
                if (needle.length > (haystack.length - i) )
                    return -1
                while (j < needle.length) {
                    if (needle[j] == haystack[tmp]) 
                        tmp++
                    else 
                        break
                    j++
                }
                if (j == needle.length)
                    return i
            }
            i++
        }        
        return -1
    }
}