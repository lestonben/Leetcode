package Tree;

import java.util.Stack;

public class q02_Maximum_Depth_of_Binary_Tree {


    // two approaches
    // 1. recursive method
    public int maxDepth(TreeNode root) {
         if (root == null) { return 0; }
         return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    // 2. iterative method
    public int maxDepth2(TreeNode root) {
        if (root == null) { return 0; }

        int max = 1;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> depth = new Stack<>();

        stack.push(root);
        depth.push(1);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            int tempDepth = depth.pop();

            if (temp.left == null && temp.right == null) {
                max = Math.max(max, tempDepth);
            }

            if (temp.left != null) {
                stack.push(temp.left);
                depth.push(tempDepth+1);
            }

            if (temp.right != null) {
                stack.push(temp.right);
                depth.push(tempDepth+1);
            }
        }
        return max;
    }
}
