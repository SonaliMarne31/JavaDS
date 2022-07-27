package Trees;
import java.util.*;

public class LCABT {

    // Hackerank Code
    public static TreeNode lca(TreeNode root, int v1, int v2) {
        // Write your code here.
        
      TreeNode a = new TreeNode(v1);
      TreeNode b = new TreeNode(v2);
      if(root == null)
          return null;
      if(root.val == a.val || root.val == b.val )
          return root;

      TreeNode left = lca(root.left,a.val,b.val);
      TreeNode right = lca(root.right,a.val,b.val);

      // If we get left and right not null , it is lca for a and b
      if(left!=null && right!=null)
          return root;
      if(left== null)
          return right;
      else
          return left;
    }

    // Leetcode problem - O(n)
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Stack for tree traversal
        Deque<TreeNode> stack = new ArrayDeque<>();

        // HashMap for parent pointers
        Map<TreeNode, TreeNode> parent = new HashMap<>();

        parent.put(root, null);
        stack.push(root);

        // Iterate until we find both the nodes p and q
        while (!parent.containsKey(p) || !parent.containsKey(q)) {

            TreeNode node = stack.pop();

            // While traversing the tree, keep saving the parent pointers.
            if (node.left != null) {
                parent.put(node.left, node);
                stack.push(node.left);
            }
            if (node.right != null) {
                parent.put(node.right, node);
                stack.push(node.right);
            }
        }

        // Ancestors set() for node p.
        Set<TreeNode> ancestors = new HashSet<>();

        // Process all ancestors for node p using parent pointers.
        while (p != null) {
            ancestors.add(p);
            p = parent.get(p);
        }

        // The first ancestor of q which appears in
        // p's ancestor set() is their lowest common ancestor.
        while (!ancestors.contains(q))
            q = parent.get(q);
        return q;
    
    }
}
