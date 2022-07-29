package Trees;

public class SymmetricTree {
	public boolean isSymm(TreeNode root) {
		if (root == null) return false;
        if (root.left == null && root.right == null) return false;
        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;
        
        // first nodes do not match
        if (leftNode.val != rightNode.val) return false;
        
        // uneven tree termination
        if (leftNode.left == null || rightNode.right != null) return false;
        
        while (leftNode != null && rightNode != null) {
            if (leftNode.val == rightNode.val) {
                leftNode = leftNode.left;
                rightNode = rightNode.right;
            } else {
                return false;
            }
        }
        return true;  
    }
	
	public static void main(String args[]) {
		SymmetricTree m = new SymmetricTree();
		TreeNode tree = new TreeNode();
		tree.val = 1;
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(2);
		tree.left.left = new TreeNode(2);
		tree.right.left = new TreeNode(2);
		
		System.out.print(m.isSymm(tree));
	}
}
