class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        var ans = mutableListOf<List<Int>>()
        backtrack(ans, candidates, target, 0, mutableListOf<Int>())
        return ans
    }
    fun backtrack(ans: MutableList<List<Int>>, candidates: IntArray, target: Int, i: Int, tmp: MutableList<Int>){
        if(tmp.sum() > target)
            return
        if(tmp.sum() == target){
            ans.add(tmp.toMutableList())
            return
        }
        for(x in i until candidates.size){
            tmp.add(candidates[x])
            backtrack(ans, candidates, target, x, tmp)
            tmp.removeAt(tmp.size - 1)
        }
        
    }
}