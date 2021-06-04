class Solution {
    fun isPalindrome(x: Int): Boolean {
        var digit = 0
        var nbr = x
        var reverse = 0
        if(x < 0)
            return false
        while(nbr > 0){
            digit = nbr % 10
            if(reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE/10 && digit > 7))
            return false
            reverse = reverse * 10 + digit
            nbr = nbr / 10
        }
        if(reverse == x)
            return true
        return false
    }
}