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
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println(preorderTraversal(root));
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        return recursion(root, new ArrayList<>());
    }

    public static List<Integer> recursion(TreeNode root, ArrayList<Integer> lijst){
        if (root == null) return lijst;
        lijst.add(root.val);
        recursion(root.left, lijst);
        recursion(root.right, lijst);
        return lijst;
    }
}