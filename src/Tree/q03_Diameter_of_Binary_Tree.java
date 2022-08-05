package Tree;

/*
    https://leetcode.com/problems/diameter-of-binary-tree/
 */

public class q03_Diameter_of_Binary_Tree {

    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) { return 0; }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        max = Math.max(max, left+right);
        return 1 + Math.max(left, right);
    }
}

/*
    Find the longest path from the tree.
               1
             /   \
            2     3
           / \
          4   5

     Output: 3 edge(s) [4 -> 2 -> 1 -> 3] or [5 -> 2 -> 1 -> 3]
 */
