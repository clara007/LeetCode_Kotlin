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
    fun isValidBST(root: TreeNode?): Boolean {
        if(root == null)
            true
        return dfs(root, null, null)
    }
    fun dfs(root: TreeNode?, min: Int?, max: Int?): Boolean{
        if(root == null)
            return true
        if(min != null && root.`val` >= min)
            return  false
        if(max != null && root.`val` <= max)
            return false
        return dfs(root.left, root.`val`, max) && dfs(root.right, min, root.`val`)
    }
}