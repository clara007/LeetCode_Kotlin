class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        var ans = mutableListOf<List<Int>>()
        backtrack(ans, nums, mutableListOf<Int>(), 0)
        return ans
    }
    fun backtrack(ans: MutableList<List<Int>>, nums: IntArray, tmp: MutableList<Int>, i: Int){
        ans.add(tmp.toMutableList())
        for(x in i until nums.size){
            tmp.add(nums[x])
            backtrack(ans, nums, tmp, x+1)
            tmp.removeAt(tmp.size - 1)
        }
    }
}