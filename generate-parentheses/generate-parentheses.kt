class Solution {
    fun generateParenthesis(n: Int): List<String> {
        var ans = mutableListOf<String>()
        backtrack(ans, n, "", n, 0)
        return ans
    }
    fun backtrack(ans: MutableList<String>, n: Int, tmp: String, left: Int, right: Int){
        if(tmp.length == n*2){
            ans.add(tmp.toString())
            return
        }
        if(left > 0){
            backtrack(ans, n, tmp+'(', left-1, right+1)
        }
        if(right > 0){
            backtrack(ans, n, tmp+')', left, right-1)
        }
    }
}