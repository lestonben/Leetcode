package Tree;

public class q03_Diameter_of_Binary_Tree {

    int max = 0;

    public int diameterOfBinaryTree(q00_TreeNode root) {
        maxDepth(root);
        return max;
    }

    public int maxDepth(q00_TreeNode root) {
        if (root == null) { return 0; }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        max = Math.max(max, left+right);
        return Math.max(left, right)+1;
    }
}
