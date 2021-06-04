class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        var ans = mutableListOf<List<Int>>()
        var used = BooleanArray(nums.size, {i -> false})
        backtrack(ans, nums, used, mutableListOf<Int>())
        return ans
    }
    fun backtrack(ans: MutableList<List<Int>>, nums: IntArray, used: BooleanArray, tmp: MutableList<Int>){
        if(tmp.size == nums.size){
            ans.add(tmp.toMutableList())
            return
        }
        for(i in nums.indices){
            if(used[i] == true)
                continue
            tmp.add(nums[i])
            used[i] = true
            backtrack(ans, nums, used, tmp)
            tmp.removeAt(tmp.size - 1)
            used[i] = false
        }
    }
}