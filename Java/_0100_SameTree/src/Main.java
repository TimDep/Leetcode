import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
public class Main {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(4));
        System.out.println(isSameTree(p, q));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> lijstp = recursion(p, new ArrayList<>());
        ArrayList<Integer> lijstq = recursion(q, new ArrayList<>());
        return lijstp.equals(lijstq);
    }

    public static ArrayList<Integer> recursion(TreeNode root, ArrayList<Integer> lijst){
        if (root == null) {
            lijst.add(Integer.MAX_VALUE);
            return lijst;
        }
        lijst.add(root.val);
        recursion(root.left, lijst);
        recursion(root.right, lijst);
        return lijst;
    }
}