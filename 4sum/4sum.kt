class Solution {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        if(nums.size < 4)
            return listOf()
        var nums1 = nums.sortedArray()
        var ans = mutableListOf<List<Int>>()
        var i = 0
        var j = 0
        var k = 0
        var l = 0
        while(i < nums1.size-3){
            while(i < nums1.size-3 && i != 0 && nums1[i-1] == nums1[i]){
                i++
            }
            j = i + 1
            while(j < nums1.size-2){
                while(j < nums1.size-2 && j != i+1 && nums1[j-1] == nums1[j]){
                    j++
                }
                k = j + 1
                l = nums1.size - 1
                while(k < l){
                    if(nums1[i] + nums1[j] + nums1[k] + nums1[l] < target)
                        k++
                    else if(nums1[i] + nums1[j] + nums1[k] + nums1[l] > target)
                        l--
                    else{
                        ans.add(listOf(nums1[i], nums1[j], nums1[k], nums1[l]))
                        k++
                        l--
                        while(k < nums1.size - 1 && nums1[k-1] == nums1[k]){
                            k++
                        }
                        while(k < l && nums1[l] == nums1[l+1]){
                            l--
                        }
                    }
                }
                j++
            }
            i++
        }
        return ans
    }
}