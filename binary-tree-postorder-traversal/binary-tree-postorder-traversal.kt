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
    fun postorderTraversal(root: TreeNode?): List<Int> {
        var ans = mutableListOf<Int>()
        postOrder(root, ans)
        return ans
    }
    fun postOrder(root: TreeNode?, ans: MutableList<Int>){
        if(root == null)
            return
        postOrder(root.left, ans)
        postOrder(root.right, ans)
        ans.add(root.`val`)
    }
}