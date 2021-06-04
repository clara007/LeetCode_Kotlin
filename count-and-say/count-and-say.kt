class Solution {
    fun countAndSay(n: Int): String {
        var i = 0
        var j = 0
        var k = 0
        var m = n
        var ans = "1"
        var tmp = ""
        while (m > 1) {
            while (i < ans.length) {
                //tmp = ""
                //j = 0
                k = 0
                while (j < ans.length) {
                    if (ans[j] == ans[i]) {
                        k++
                        j++
                    }
                    else
                        break
                }
                tmp = tmp + k.toString() + ans[i]
                i = j
            }
            ans = tmp
            tmp = ""
            i = 0
            j = 0
            m--
        }
        return ans
    }
}