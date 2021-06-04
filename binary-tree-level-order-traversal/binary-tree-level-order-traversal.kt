/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        var ans = mutableListOf<List<Int>>()
        var tmpList = mutableListOf<Int>()
        var myQueue = mutableListOf<TreeNode>()
        if (root == null) 
            return ans
        myQueue.add(root)
        while(!myQueue.isEmpty()) {
            var size = myQueue.size // or myQueue.count()
            tmpList.clear()
            for(i in 0 until size) {
                var currentNode = myQueue.removeAt(0)
                tmpList.add(currentNode.`val`)
                if(currentNode.left != null) 
                    myQueue.add(currentNode.left)
                if(currentNode.right != null) 
                    myQueue.add(currentNode.right)
            }
            ans.add(tmpList.toList())
        }
        return ans
    }
}