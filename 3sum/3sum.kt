class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        var nums1 = nums.sortedArray()
        var i = 0
        var j = 0
        var k = 0
        var ans = mutableListOf<List<Int>>()
        while(i < nums1.size-2){
            while(i < nums1.size && i-1 >= 0 && nums1[i-1] == nums1[i]){
                i++
            }
            j = i+1
            k = nums1.size - 1
            while(j < k){
                if(nums1[i] + nums1[j] + nums1[k] < 0)
                    j++
                else if(nums1[i] + nums1[j] + nums1[k] > 0)
                    k--
                else {
                    ans.add(listOf(nums1[i], nums1[j], nums1[k]))
                    j++
                    while(j < nums1.size && nums1[j-1] == nums1[j]){
                        j++
                    }
                }
            }
            i++
        }
        return ans
    }
}