class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        var midIndex = 0
        var ans: Double = 0.0
        if(nums1.size == 0 && nums2.size == 0)
            return ans
        else if(nums1.size == 0 && nums2.size != 0){
            midIndex = (nums2.size - 1) / 2
            if(nums2.size % 2 == 0)
                ans = (nums2[midIndex] + nums2[midIndex+1]).toDouble() / 2
            else
                ans = (nums2[midIndex]).toDouble()
        }
        else if(nums2.size == 0 && nums1.size != 0){
            midIndex = (nums1.size - 1) / 2
            if(nums1.size % 2 == 0)
                ans = (nums1[midIndex] + nums1[midIndex+1]).toDouble() / 2
            else
                ans = (nums1[midIndex]).toDouble()
        }
        else{
            var nums3 = IntArray(nums1.size + nums2.size)
            var i = 0
            var j = 0
            var k = 0
            while(i < nums1.size && j < nums2.size){
                if(nums1[i] < nums2[j]){
                    nums3[k] = nums1[i]
                    i++
                    k++
                }
                else{
                    nums3[k] = nums2[j]
                    j++
                    k++
                }
            }
            while(i < nums1.size){
                nums3[k] = nums1[i]
                i++
                k++
            }
            while(j < nums2.size){
                nums3[k] = nums2[j]
                j++
                k++
            }
            midIndex = (nums3.size - 1) / 2
            if(nums3.size % 2 == 0 )
                ans = (nums3[midIndex] + nums3[midIndex+1]).toDouble() / 2
            else
                ans = (nums3[midIndex]).toDouble()
        }
        return ans
    }
}