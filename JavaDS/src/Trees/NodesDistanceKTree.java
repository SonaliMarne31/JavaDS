package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class NodesDistanceKTree {
	
	private HashMap<TreeNode, TreeNode> parentChild = new HashMap<>();
	
	public void dfs(TreeNode root, TreeNode parent) {
		
		if(root != null) {
			parentChild.put(root, parent);
			dfs(root.left, root);
			dfs(root.right, root);
		}
	}
	
	public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
		
		dfs(root, null);
		
		Queue<TreeNode> nodeQ = new LinkedList<>();
		Set<TreeNode> seen = new HashSet<>();
		nodeQ.add(null);
		nodeQ.add(target);
		seen.add(target);
		seen.add(null);
		
		int dist = 0;
		
		while (!nodeQ.isEmpty()) {
			TreeNode node = nodeQ.poll();
			if (node == null) {
				if (dist == k) {
					List<Integer> ans = new ArrayList<Integer>();
					for(TreeNode t: nodeQ) {
						ans.add(t.val);
					}
					return ans;
				}
				nodeQ.add(null);
				dist++;
				
			} else if (node != null) {
				
				if(!seen.contains(node.left)) {
					seen.add(node.left);
					nodeQ.add(node.left);
				}
				
				if(!seen.contains(node.right)) {
					seen.add(node.right);
					nodeQ.add(node.right);
				}
				TreeNode pNode = parentChild.get(node);
				if(!seen.contains(pNode)) {
					seen.add(pNode);
					nodeQ.add(pNode);
				}
			}
		}
		
		
		
		
		return new ArrayList<Integer>();
		
	}
	
	
	

	public static void main(String[] args) {
		NodesDistanceKTree k = new NodesDistanceKTree();
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
