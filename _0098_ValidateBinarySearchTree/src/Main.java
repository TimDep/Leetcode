import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode base = new TreeNode();
        System.out.println(isValidBST(root, base));
    }

    public static boolean isValidBST(TreeNode root, TreeNode base) {
        if (root == null) return false;
        isValidBST(root.left, base);
        if (root.val<)
        base =  root;
        isValidBST(root.right, base);
        return true;
    }
}