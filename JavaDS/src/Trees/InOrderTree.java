package Trees;

import java.util.*;

public class InOrderTree {
	List<Integer> list = new ArrayList<>();
	
	public List inorder(TreeNode root) {
        if (root == null) return null;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
        return list;
    }
	
	public void kThSmallest(TreeNode tree) {
		int k = 3;
		List l = inorder(tree);
		Collections.sort(list);
        System.out.println(l.get(k-1));
	}
	
	public void inOrderIterative(TreeNode tree) {
		Stack<TreeNode> s = new Stack();
		
		TreeNode curr = tree;
		
		while(curr != null || !s.isEmpty()) {
			while(curr != null) {
				s.push(curr);
				curr = curr.left;
			}
			curr = s.pop();
			System.out.print(curr.val+ " ");
			curr = curr.right;
		}
	}
	
	
	public void posrOrder(TreeNode tree) {
		Stack<TreeNode> s = new Stack();
		
		TreeNode curr = tree;
		while (curr != null && !s.isEmpty()) {
			while(curr != null) {
				s.push(curr);
				s.push(curr);
				curr = curr.left;
			}
			if (s.isEmpty()) return;
			curr = s.pop();
			if (!s.isEmpty() && s.peek() == curr) {
				curr = curr.right;
			} else {
				System.out.print(curr.val + " ");
				curr = null;
			}
		}
		
	}
	
	public void preOrder(TreeNode root) {
		List<Integer> ll = new ArrayList<>();
		if (root == null) return;
		
        ll.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(ll);
	}
	
	public void preOrderIt(TreeNode root) {
		Stack<TreeNode> nodeStack = new Stack<>();
		nodeStack.add(root);
		System.out.println("Pre Order Iterative");
		while (nodeStack.empty() == false) {
			 
            // Pop the top item from stack and print it
            TreeNode mynode = nodeStack.peek();
            System.out.print(mynode.val + " ");
            nodeStack.pop();
 
            // Push right and left children of the popped node to stack
            if (mynode.right != null) {
                nodeStack.push(mynode.right);
            }
            if (mynode.left != null) {
                nodeStack.push(mynode.left);
            }
        }
		
	}
	
	public void levelOrder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        System.out.println();

        while (!queue.isEmpty()) {


            TreeNode node = queue.peek();
            if (node != null) {
                System.out.print(node.val + " ");
                queue.remove();

                if (node.left != null)
                    queue.add(node.left);

                if (node.right != null)
                    queue.add(node.right);
            }

        }
	}
	
	
	public List<List<Integer>> levelOrderList(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
        

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
        	int size = queue.size();
        	List<Integer> temp = new ArrayList<>();
        	
        	while(size > 0) {
                TreeNode curr = queue.remove();
        		temp.add(curr.val);
        		if(curr.left != null) queue.add(curr.left);
        		
        		if(curr.right != null) queue.add(curr.right);
        		
        		size--;
        		
        	}
        	if(temp.size() != 0) list.add(temp);
        }
        return list;
        
    }
	
	
	
	public static void main(String args[]) {
		
		InOrderTree in = new InOrderTree();
		int k = 1;
		
		TreeNode tree = new TreeNode();
		tree = new TreeNode();
//        tree.left = new TreeNode(9);
//        tree.right = new TreeNode(20);
//        tree.right.left = new TreeNode(15);
//        tree.right.right = new TreeNode(7);
        
//        in.kThSmallest(tree);
//        in.inOrderIterative(tree);
//        in.posrOrder(tree);
//        in.preOrder(tree);
//        in.preOrderIt(tree);
//        in.levelOrder(tree);
        in.levelOrderList(tree);
	}

}
