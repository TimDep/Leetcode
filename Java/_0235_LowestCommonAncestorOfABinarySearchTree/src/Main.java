import javax.swing.tree.TreeCellRenderer;
import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return val +"";
    }
}

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left =new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        System.out.println(lowestCommonAncestor(root, p, q));
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if (root.left.val==p.val && root.right.val == q.val || root.right.val ==p.val && root.left.val == q.val){
//            return root;
//        }
        int teller = 0;
        TreeNode ancestor = null;
        return recursion(root, teller, p, q, ancestor);

    }

    public static TreeNode recursion(TreeNode root, int teller, TreeNode p, TreeNode q, TreeNode ancestor){
        if (root == null) return ancestor;
        recursion(root.left, teller, p,q, ancestor);
        ancestor=root;
        recursion(root.right, teller, p, q, ancestor);
        return ancestor;
    }
}