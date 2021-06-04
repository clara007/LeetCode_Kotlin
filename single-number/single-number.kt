class Solution {
    fun singleNumber(nums: IntArray): Int {
        var mySortedArray = nums.sortedArray()
        var i = 0
        var j = 1
        var k = 2
        var ans = 0
        if (nums.size == 1)
            return nums[0]
        while (k < mySortedArray.size) {
            if ( i == 0 && mySortedArray[i] != mySortedArray[j] ) {
                ans =  mySortedArray[i]
                break
            }
            else if (mySortedArray[i] != mySortedArray[j] && mySortedArray[j] != mySortedArray[k]) {
                ans = mySortedArray[j]
                break
            }
            else if (mySortedArray[i] == mySortedArray[j] && k == mySortedArray.size-1) {
                ans = mySortedArray[k]
                break
            }
            else {
                i++
                j++
                k++
            }
        }
        return ans
    }
}