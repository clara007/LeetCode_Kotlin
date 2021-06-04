class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        var tmp = IntArray(26)
        var i = 0
        
        if (s.length != t.length || s == null || t == null)
            return false
        
        while (i < s.length) {
            tmp[s[i] - 'a']++
            tmp[t[i] - 'a']--
            i++
        }
        
        for (j in tmp.indices) {
            if (tmp[j] != 0)
                return false
        }
        return true
    }
}