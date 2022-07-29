package Trees;

public class KthSmallest {
	public int getSmallest(TreeNode root, int k) {
        TreeNode curr = root;
        int minValue = curr.val;
        int minArr[];
        if (curr == null) return minValue;
        
        while(curr != null) {
            if(curr.val < minValue) {
                minValue = curr.val;
            }
            curr = curr.left;
        }
        curr = root;
        while(curr != null) {
            if(curr.val < minValue) {
                minValue = curr.val;
            }
            curr = curr.right;
        }
        return minValue;
    }
	
	public static void main(String args[]) {
		KthSmallest m = new KthSmallest();
		TreeNode tree = new TreeNode();
		tree.val = 5;
		tree.left = new TreeNode(3);
		tree.right = new TreeNode(6);
		tree.left.left = new TreeNode(2);
		tree.left.right = new TreeNode(4);
		tree.left.left.left = new TreeNode(1);
		
		System.out.print(m.getSmallest(tree, 3));
	}
}
