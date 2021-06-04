class Solution {
    fun myAtoi(s: String): Int {
        var digit = 0
        var nbr = 0
        var sign = 1
        var i = 0
        while(i < s.length && s[i] == ' '){
            i++
        }
        if(i < s.length && (s[i] == '-' || s[i] == '+') ){
            if(s[i] == '-')
                sign = -1
            i++
        }
        while(i < s.length && s[i] >= '0' && s[i] <= '9'){
            digit = s[i] - '0'
            if(nbr > Integer.MAX_VALUE/10 || (nbr == Integer.MAX_VALUE/10 && digit > 7) ){
                if(sign == -1)
                    return Integer.MIN_VALUE
                return Integer.MAX_VALUE
            }
            nbr = nbr * 10 + digit
            i++
        }
        return sign * nbr
    }
}