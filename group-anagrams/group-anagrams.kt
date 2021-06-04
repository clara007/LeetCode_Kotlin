class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        var ans = ArrayList<List<String>>()
        var tmpList = mutableListOf<String>()
        var myHashMap = HashMap<String, MutableList<String>>()
        
        if (strs == null || strs.size == 0)
            return ans
        for (str in strs) {
            var tmp = str.toCharArray().sorted().joinToString()
            if (myHashMap.containsKey(tmp) )
                (myHashMap[tmp]!!).add(str)
            else
                myHashMap.put(tmp, mutableListOf(str))
        }
        
        for (key in myHashMap.keys) {
            ans.add(myHashMap[key]!!)
        }
        return ans
    }
}