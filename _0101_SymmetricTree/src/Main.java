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
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        System.out.println(isSymmetric(root));
    }

    public static boolean isSymmetric(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right =root.right;
        return recursion(left, right);

    }

    public static boolean recursion(TreeNode left, TreeNode right){
        if(left==null || right==null)
            return (left==right);
        if(left.val!=right.val)
            return false;
        return recursion(left.left,right.right) && recursion(left.right,right.left);
    }
}