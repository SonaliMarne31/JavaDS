package Trees;

public class ArrayToBST {
	public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        
		if (start > end) return null;
        
        int mid = start + (end - start) / 2;
        
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, start, mid-1);
        node.right = sortedArrayToBST(nums, mid+1, end);
        
        return node;
    }
	
	public static void main(String args[]) {
		ArrayToBST a = new ArrayToBST();
		int[] intArray = new int[]{ -10, -3, 0, 5, 9 }; 
		TreeNode n = a.sortedArrayToBST(intArray, 0, intArray.length - 1);
		System.out.print(n);
	}
}
