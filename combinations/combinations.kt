class Solution {
    fun combine(n: Int, k: Int): List<List<Int>> {
        var ans = mutableListOf<List<Int>>()
        backtrack(ans, n, k, mutableListOf<Int>(), 1)
        return ans
    }
    fun backtrack(ans: MutableList<List<Int>>, n: Int, k: Int, tmp: MutableList<Int>, i: Int){
        if(tmp.size == k){
           ans.add(tmp.toMutableList())
           return
        }
        for(x in i .. n){
            tmp.add(x)
            backtrack(ans, n, k, tmp, x+1)
            tmp.removeAt(tmp.size -1)
        }
    }
}