class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var myMap = HashMap<Int, Int>()
        var i = 0
        var j = 0
        for(k in nums.indices){
            myMap.put(nums[k], k)
        }
        while(i < nums.size){
            j = target - nums[i]
            if(myMap.containsKey(j) && myMap.get(j) != i){
                return intArrayOf(i, myMap.get(j)!!)
            }
            i++
        }
        return intArrayOf(i, j)
    }
}