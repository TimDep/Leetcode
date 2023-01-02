import java.util.ArrayList;
import java.util.List;

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
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(middleNode(l1));
    }

    public static ListNode middleNode(ListNode head) {
        ListNode oplossing;
        ListNode hulp;
        List<Integer> l1 = new ArrayList<>();
        while (head!=null){
            l1.add(head.val);
            head = head.next;
        }
        int vanaf = (int) Math.floor(l1.size()/2);
        oplossing = hulp= new ListNode();
        for (int i =vanaf; i<l1.size(); i++){
            oplossing.next=new ListNode(l1.get(i));
            oplossing = oplossing.next;
        }
        return hulp.next;
    }
}