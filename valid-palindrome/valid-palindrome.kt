class Solution {
    fun isPalindrome(s: String): Boolean {
        var str = ""
        var k = 0
        while(k < s.length){
            if(s[k].isLetter() || s[k].isDigit())
                str = str + s[k].toLowerCase()
            k++
        }
        var ans = true
        var i = 0
        var j = str.length - 1
        while(i <= j){
            
            if(str[i] != str[j])
                return false
            i++
            j--
        }
        return ans
    }
}