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
    fun maxDepth(root: TreeNode?): Int {
        if(root == null)
            return 0
        if(root.left == null && root.right == null)
            return 1
        if(root.left == null)
            return 1 + maxDepth(root.right)
        if(root.right == null)
            return 1 + maxDepth(root.left)
        return  1 + maxOf(maxDepth(root.left), maxDepth(root.right))
    }
}