class Solution {
    fun intToRoman(num: Int): String {
        var i = 0
        var nbr = num
        var ans = ""
        var digit = arrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        var letter = arrayOf("M", "CM", "D", "CD",  "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
        while(i < digit.size && nbr > 0){
            if(nbr - digit[i] >= 0){
                ans = ans + letter[i]
                nbr = nbr - digit[i]
            }
            else
                i++
        }
        return ans
    }
}