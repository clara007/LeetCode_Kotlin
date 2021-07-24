class Solution {
    fun isValid(s: String): Boolean {
        var myStack = Stack<Char>()
        if(s.length % 2 != 0)
            return false
        for(c in s){
            if(c == '(')
                myStack.push(')')
            else if(c == '{')
                myStack.push('}')
            else if(c == '[')
                myStack.push(']')
            else if(myStack.isEmpty() || myStack.pop() != c)
                return false
        }
        return myStack.isEmpty()
    }
}