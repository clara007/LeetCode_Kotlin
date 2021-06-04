class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var ans = 0
        var tmp = 0
        if (nums.size == 0)
            return 0
        if (nums.size == 1)
            return nums[0]
        tmp = nums[0]
        ans = nums[0]
        for (i in 1 until nums.size) {
            tmp = max(tmp + nums[i], nums[i])
            if (tmp > ans)
                ans = tmp
        }
        return ans
    }
    
    fun max(sum: Int, high: Int): Int {
        var res = sum
        if (sum > high)
            res = sum
        else if (high > sum)
            res =  high
        return res
    }
}