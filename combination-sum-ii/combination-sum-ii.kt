class Solution {
    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        var ans = mutableListOf<List<Int>>()
        backtrack(ans, candidates.sortedArray(), target, mutableListOf<Int>(), 0)
        return ans
    }
    fun backtrack(ans: MutableList<List<Int>>, candidates: IntArray, target: Int, tmp: MutableList<Int>, i: Int){
        if(tmp.sum() == target){
            if(!ans.contains(tmp))
                ans.add(tmp.toMutableList())
            return
        }
        else if(tmp.sum() > target){
            return
        }
        for(x in i until candidates.size){
            tmp.add(candidates[x])
            backtrack(ans, candidates, target, tmp, x+1)
            tmp.removeAt(tmp.size - 1)
        }
    }
}