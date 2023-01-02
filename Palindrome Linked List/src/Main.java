import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString(){
        return val + " " + next;
    }

}

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(1)));
        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        List<Integer> lijst1 = new ArrayList<>();
        while (head != null){
            lijst1.add(head.val);
            head = head.next;
        }
        int laatste= lijst1.size()-1;
        for (int i=0; i<Math.floor((double) lijst1.size()/2); i++){
            if (!Objects.equals(lijst1.get(i), lijst1.get(laatste))){
                return false;
            }
            laatste--;
        }
        return true;
    }
}