class Solution {
    fun longestPalindrome(s: String): String {
        var ans = ""
        var str1 = ""
        var str2 = ""
        var i = 0
        while(i < s.length){
            str1 = expandFromIndex(s, i, i)
            str2 = expandFromIndex(s, i, i+1)
            if(str1.length > ans.length)
                ans = str1
            if(str2.length > ans.length)
                ans = str2
            i++
        }
        return ans
    }
    
    fun expandFromIndex(str: String, a: Int, b: Int): String{
        var i = a
        var j = b
        var topString  = ""
        var bottomString = ""
        if(i == j && j < str.length && str[i] == str[j]){
            topString = str[i] + topString
            i--
            j++
        }
        else if(i != j && j < str.length && str[i] == str[j]){
            topString = str[i] + topString
            bottomString = bottomString + str[j]
            i--
            j++
        }
        while(i >= 0 && j < str.length && str[i] == str[j]){
            topString = str[i] + topString
            bottomString = bottomString + str[j]
            i--
            j++
        }
        return topString + bottomString
    }
}