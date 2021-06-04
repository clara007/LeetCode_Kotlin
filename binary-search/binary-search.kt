class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var i = 0
        var j = nums.size - 1 
        var mid = 0
        while(i <= j){
            mid = i + (j - i)/2
            if(nums[mid] == target)
                return mid
            else if(nums[mid] < target)
                i = mid + 1
            else
                j = mid - 1
        }
        return -1
    }
}