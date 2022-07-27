package Trees;
import java.util.*;

public class PreorderBT {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        preorder(root, ls);
        return ls;
    }
    public void preorder(TreeNode root, List<Integer> ls){
        if(root==null){
            return;
        }
        ls.add(root.val);
        preorder(root.left, ls);
        preorder(root.right, ls);
    }

    public static void main(String args[]) {
        TreeNode tree = new TreeNode(1);
		tree.right = new TreeNode(2);
		tree.right.right = new TreeNode(5);
        tree.right.right.left = new TreeNode(3);
        tree.right.right.right = new TreeNode(6);
		tree.right.right.left.right = new TreeNode(4);
        
    }
}
