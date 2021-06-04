class Solution {
    fun combinationSum3(k: Int, n: Int): List<List<Int>> {
        var ans = mutableListOf<List<Int>>()
        backtrack(ans, k, n, 1, mutableListOf<Int>())
        return ans
    }
    fun backtrack(ans: MutableList<List<Int>>, k: Int, n: Int, i: Int, tmp: MutableList<Int>){
        if(tmp.size == k){
            if(tmp.sum() == n)
                ans.add(tmp.toMutableList())
            return
        }
        for(x in i .. 9){
            tmp.add(x)
            backtrack(ans, k, n, x+1, tmp)
            tmp.removeAt(tmp.size - 1)
        }
    }
}