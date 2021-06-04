class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var ansList = mutableListOf<Int>()
        var i = digits.size - 1
        var sum = 0
        var tmp = 0
        
        if (digits.size == 0)
            return intArrayOf()
        
        while (i >= 0) {
            if (i == digits.size - 1)
                sum = digits[i] + 1
            else
                sum = digits[i] + tmp 
            if (sum >= 10)
                tmp = 1
            else
                tmp = 0
            ansList.add(sum % 10)
            i--
        }
        if (tmp == 1)
            ansList.add(tmp)
        return ansList.toIntArray().reversedArray()
    }
}