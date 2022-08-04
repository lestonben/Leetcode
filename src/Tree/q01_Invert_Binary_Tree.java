package Tree;

/*
    https://leetcode.com/problems/invert-binary-tree/
 */

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class q01_Invert_Binary_Tree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) { return null; }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            TreeNode left = temp.left;
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
