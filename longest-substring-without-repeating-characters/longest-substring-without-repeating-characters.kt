class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var ans = 0
        var i = 0
        var j = 0
        var mySet =  mutableSetOf<Char>()
        while(i < s.length){
            if(mySet.contains(s[i])){
                if(ans < mySet.size)
                    ans = mySet.size
                mySet.clear()
                i = j
                j++
            }
            else{
                mySet.add(s[i])
                i++
            }
        }
        if(ans < mySet.size)
            ans = mySet.size
        return ans
    }
}