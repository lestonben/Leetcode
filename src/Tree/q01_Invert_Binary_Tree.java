package Tree;

/*
    https://leetcode.com/problems/invert-binary-tree/
 */

import java.util.Stack;

public class q01_Invert_Binary_Tree {

    public q00_TreeNode invertTree(q00_TreeNode root) {
        if (root == null) { return null; }

        Stack<q00_TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            q00_TreeNode temp = stack.pop();
            q00_TreeNode left = temp.left;
            temp.left = temp.right;
            temp.right = left;

            if (temp.left != null) { stack.push(temp.left); }
            if (temp.right != null) { stack.push(temp.right); }
        }
        return root;
    }


    /*
            Input: 4 2 7 1 3 6 9
           Output: 4 7 2 9 6 3 1


                        4
                    2       7
                  1   3   6   9

                        4
                    7       2
                  9   6   3   1
     */
}
