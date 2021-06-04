class Solution {
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        var ans = mutableListOf<List<Int>>()
        backtrack(ans, nums.sortedArray(), 0, mutableListOf<Int>()) //why important to sort?
        return ans
    }
    fun backtrack(ans: MutableList<List<Int>>, nums: IntArray, i: Int, tmp: MutableList<Int>){
        if(!ans.contains(tmp)){
            ans.add(tmp.toMutableList())
        }
        for(x in i until nums.size){
            tmp.add(nums[x])
            backtrack(ans, nums, x+1, tmp)
            tmp.removeAt(tmp.size - 1)
        }
    }
}