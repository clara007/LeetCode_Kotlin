class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 0
        var j = 1
        if (nums.size == 0)
            return 0
        while (j < nums.size) {
            if (nums[i] != nums[j]) {
                i++
                nums[i] = nums[j]
            }
            j++
        }
        return i + 1 
    }
}