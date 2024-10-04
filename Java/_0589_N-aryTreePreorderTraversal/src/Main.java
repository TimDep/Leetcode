import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class Main {
    public static void main(String[] args) {
        System.out.println(preorder(root));
    }

    public static List<Integer> preorder(Node root) {
        return recursion(root, new ArrayList<>());
    }

    public static List<Integer> recursion(Node root, ArrayList<Integer> lijst){
        if (root == null) return lijst;
        lijst.add(root.val);
        for (int i =0; i<root.children.size(); i++){
            recursion(root.children.get(i), lijst);
        }
        return lijst;
    }
}