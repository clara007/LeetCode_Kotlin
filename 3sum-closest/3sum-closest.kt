class Solution {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        var nums1 = nums.sortedArray()
        var ans = 0
        var i = 0
        if(nums1.size >= 3)
            ans = nums1[0] + nums1[1] + nums1[2]
        while(i < nums1.size-2){
            while(i != 0 && i < nums1.size-2 && nums1[i-1] == nums1[i]){
                i++
            }
            var j = i + 1
            var k = nums1.size - 1
            while(j < k){
                var sum = nums1[i] + nums1[j] + nums1[k]
                if(sum < target){
                    j++
                }
                else if(sum > target){
                    k--
                }
                else{
                    return nums1[i] + nums1[j] + nums1[k]
                }
                
                if(Math.abs(ans - target) > Math.abs(sum - target)){
                    ans = sum
                }
            }
            i++
        }
        return ans
    }
}