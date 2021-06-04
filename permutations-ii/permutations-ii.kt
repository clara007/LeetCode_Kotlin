class Solution {
    fun permuteUnique(nums: IntArray): List<List<Int>> {
        var ans = mutableListOf<List<Int>>()
        var used = BooleanArray(nums.size, {i -> false})
        backtrack(ans, nums, used, mutableListOf<Int>())
        return ans
    }
    fun backtrack(ans: MutableList<List<Int>>, nums: IntArray, used: BooleanArray, tmp: MutableList<Int>){
        if(tmp.size == nums.size){
            if(!ans.contains(tmp))
                ans.add(tmp.toMutableList())
            return
        }
        for(x in 0 until nums.size){
            if(used[x])
                continue
            tmp.add(nums[x])
            used[x] = true
            backtrack(ans, nums, used, tmp)
            tmp.removeAt(tmp.size - 1)
            used[x] = false
        }
    }
}