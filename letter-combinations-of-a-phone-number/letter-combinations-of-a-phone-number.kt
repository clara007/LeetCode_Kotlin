class Solution {
    fun letterCombinations(digits: String): List<String> {
        if(digits.length == 0 || digits == "")
            return listOf()
        var ans = mutableListOf<String>()
        backtrack(ans, 0, "", digits)
        return ans
    }
    fun backtrack(ans: MutableList<String>, i: Int, tmp: String, digits: String){
        if(tmp.length == digits.length){
            ans.add(tmp.toString())
            return
        }
        var digitsMap = arrayOf("", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz")
        var value = digits[i] - '0'
        var letters = digitsMap[value-1]
        for(x in letters){
           backtrack(ans, i+1, tmp+x, digits) 
        }
    }
}