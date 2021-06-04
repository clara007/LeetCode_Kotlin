class Solution {
    //Instead of int, use long. This is because int only goes up to 2147395600, while long goes much        
    //higher than that. However, the expense is that you would have to convert to long, then back to int.
    fun mySqrt(x: Int): Int {
        var i: Long = 1
        if (x == 0 || x == 1) {
            return x
        }
        while (i * i <= x) {
            i++
        }
        return (i-1).toInt()
    }
}