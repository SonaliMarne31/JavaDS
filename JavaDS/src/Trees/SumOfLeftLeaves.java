package Trees;
import java.util.*;

public class SumOfLeftLeaves {
    private boolean isLeaf(TreeNode node) {
        return node != null && node.left == null && node.right == null;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int total = 0;
        // ArrayDeque implements Deque >>>> It is an array with dynamic size
        // We can add/remove elements from both the ends
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
          TreeNode subRoot = stack.pop();
          // Check if the left node is a leaf node.
           if (isLeaf(subRoot.left)) {
            total += subRoot.left.val;
          }
          // If the right node exists, put it on the stack.
          if (subRoot.right != null) {    
            stack.push(subRoot.right);
          }
          // If the left node exists, put it on the stack.
          if (subRoot.left != null) {
            stack.push(subRoot.left);
          }
        }

        return total;
    }
}
