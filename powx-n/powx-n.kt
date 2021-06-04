class Solution {
    fun myPow(x: Double, n: Int): Double {
        var num = 0.0
        var pow = 0
        var ans: Double = 1.0
        
        if (n == 0 || x == 1.0)
            return 1.0
        
        if (x == 0.0)
            return 0.0
        
        if (n < 0) {
            num = 1/x 
            pow = -n
        }
        else {
            num = x
            pow = n
        }
              
        if(x!=-1.0 && n == Int.MIN_VALUE) 
            return 0.0
        if(x == -1.0 && n == Int.MIN_VALUE) 
            return 1.0
        
        if (pow % 2 == 0) 
           ans = myPow(num*num, pow/2) 
        else
            ans = num*myPow(num*num, pow/2)
        
        return ans
    }
}