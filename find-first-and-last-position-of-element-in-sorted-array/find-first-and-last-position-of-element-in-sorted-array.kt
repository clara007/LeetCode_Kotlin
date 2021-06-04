class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        var ans = IntArray(2)
        ans[0] = leftIndex(nums, target)
        ans[1] = rightIndex(nums, target)
        return ans
    }
    fun leftIndex(nums: IntArray, target: Int): Int{
        var ans = -1
        var i = 0
        var j = nums.size -1
        var mid = 0
        while(i <= j){
            mid = i + (j - i)/2
            if(nums[mid] >= target){
                j = mid - 1
            }
            else
                i = mid + 1
            if(nums[mid] == target)
                ans = mid
        }
        return ans
    }
    fun rightIndex(nums: IntArray, target: Int): Int{
        var ans = -1
        var i = 0
        var j = nums.size -1
        var mid = 0
        while(i <= j){
            mid = i + (j - i)/2
            if(nums[mid] <= target){
                i = mid + 1
            }
            else 
                j = mid - 1
            if(nums[mid] == target)
                ans = mid
        }
        return ans
    }
}