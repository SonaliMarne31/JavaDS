package Trees;

import java.util.*;

public class NodesDistanceK {
	HashMap<Integer, Integer> allNodes = new HashMap<>();
    HashMap<Integer, List<Integer>> levelWise = new HashMap<>();
    List<Integer> list;
    
    private int height(TreeNode root) {
    	if (root == null)
            return 0;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = height(root.left);
            int rDepth = height(root.right);
            return Math.max(lDepth, rDepth);
        }
    }
    
    private void addnode(TreeNode node, int level) {
    	list = new ArrayList<>();
        allNodes.put(node.val, level);
        if(levelWise.get(level) != null) {
            list = levelWise.get(level);
            list.add(node.val);
            levelWise.put(level, list);
        } else {
            list.add(node.val);
            levelWise.put(level, list);
        }
    }
    
    /* Print nodes at a given level */
    private void printGivenLevel(TreeNode root, int level, int h)
    {
    	list = new ArrayList<>();
        if (root == null)
            return;
        if (level == 1) {
        	addnode(root, h);
        } else if (level > 1) {
            printGivenLevel(root.left, level-1, h);
            printGivenLevel(root.right, level-1, h);
        }
    }
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
    	MaxBinTreeDepth m = new MaxBinTreeDepth();
    	int h = m.maxDepth(root) + 1;
        int i;
        for (i=1; i<=h; i++)
        {
            printGivenLevel(root, i, i);
        }
        int targetLevel = 0;
        if(allNodes.get(target.val) != null) {
            targetLevel = allNodes.get(target.val);
        }
        List<Integer> ll = levelWise.get(targetLevel+2);
        return ll;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodesDistanceK k = new NodesDistanceK();
		TreeNode tree = new TreeNode(3);
		tree.left = new TreeNode(5);
		tree.right = new TreeNode(1);
		tree.left.left = new TreeNode(6);
		tree.left.right = new TreeNode(2);
		tree.left.right.left = new TreeNode(7);
		tree.left.right.right = new TreeNode(4);
		tree.right.left = new TreeNode(0);
		tree.right.right = new TreeNode(8);
		
		List<Integer> kk = k.distanceK(tree, tree.left, 2);
		System.out.println(kk);
	}

}
