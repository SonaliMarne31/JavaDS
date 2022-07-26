package Trees;
import java.util.*;

public class LevelOrderBT {
    static void printLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.val + " ");
   
            /*add left child to the queue */
            if (temp.left != null) {
                queue.add(temp.left);
            }
            /*add right right child to the queue */
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }
  
}
