class Solution {
    fun reverseWords(s: String): String {
        var myWords = s.split(" ")
        var ans = ""
        var i = myWords.size - 1
        while(i >= 0){
            if(myWords[i].isNotBlank() && ans.isBlank()){
                ans = ans + myWords[i] 
            }
            else if(myWords[i].isNotBlank() && ans.isNotBlank()){
                ans = ans + " " + myWords[i] 
            }
            i--
        }
        return ans
    }
}