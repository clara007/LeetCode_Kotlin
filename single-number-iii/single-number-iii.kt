class Solution {
    fun singleNumber(nums: IntArray): IntArray {
        var mySortedArray = nums.sortedArray()
        var i = 0
        var j = 1
        var k = 2
        var index = 0
        var ans = IntArray(2)
        if (nums.size == 2 && nums[0] != nums[1])
            return nums
        while (k < mySortedArray.size) {
            if ( i == 0 && mySortedArray[i] != mySortedArray[j] ) {
                ans[index] = mySortedArray[i]
                index++
                if (mySortedArray[j] != mySortedArray[k]) {
                    ans[index] = mySortedArray[j]
                    index++
                    break
                }
            }
            else if (mySortedArray[i] != mySortedArray[j] && mySortedArray[j] != mySortedArray[k]) {
                ans[index] = mySortedArray[j]
                index++
                if (k + 1 < mySortedArray.size && mySortedArray[k] != mySortedArray[k+1]) {
                    ans[index] = mySortedArray[k]
                    index++
                    break
                }
                else if (k == mySortedArray.size-1) {
                    ans[index] = mySortedArray[k]
                    index++
                    break
                }
                
            }
            else if (mySortedArray[i] == mySortedArray[j] && k == mySortedArray.size-1) {
                ans[index] = mySortedArray[k]
                index++
            }
            i++
            j++
            k++
        }
        return ans
    }
}