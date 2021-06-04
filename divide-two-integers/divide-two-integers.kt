class Solution {
    fun divide(dividend: Int, divisor: Int): Int {
        var tmpDividend = dividend
        var tmpDivisor = divisor
        var ans = 0
        var tmp = 0
        if (dividend == Int.MIN_VALUE && divisor == -1) 
            return Int.MAX_VALUE
        if (dividend == 0)
            return 0
        if (divisor == 1)  
            return dividend
        
        
        if (tmpDividend > 0)
            tmpDividend = -tmpDividend
        if (tmpDivisor > 0)
            tmpDivisor = -tmpDivisor
        
        tmp = tmpDivisor
        
        while (tmpDividend <= tmpDivisor) {
            tmpDividend = tmpDividend - tmpDivisor
            ans++
        }
        if (dividend < 0 && divisor < 0)
            return ans
        if (dividend > 0 && divisor < 0)
            return -ans
        if (dividend < 0 && divisor > 0)
            return -ans
        return ans
    }
}