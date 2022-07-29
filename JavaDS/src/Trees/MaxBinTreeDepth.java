package Trees;

public class MaxBinTreeDepth {
	
	public int maxDepth(TreeNode root) {
        int height = 0;
        int rHeight = 0;
        if (root == null) return height;
        if (root.left == null && root.right == null) return height + 1;
        TreeNode current = root;
        while(current.left != null) {
            height++;
            current = current.left;
        }
        current = root;
        while(current.right != null) {
            rHeight++;
            current = current.right;
        }
        return Math.max(height, rHeight) + 1;
    }
	
	public static void main(String args[]) {
		MaxBinTreeDepth m = new MaxBinTreeDepth();
		TreeNode tree = new TreeNode();
		tree.val = 1;
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(2);
		tree.left.left = new TreeNode(2);
		// tree.left.right = new TreeNode(null);
		tree.right.left = new TreeNode(2);
		
		System.out.print(m.maxDepth(tree));
	}
}
