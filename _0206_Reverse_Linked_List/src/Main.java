import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(reverseList(head));
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode curr = head;
        ListNode next = curr.next;
        ListNode temp;
        curr.next = null;
        while (next != null) {
            temp = next.next;
            next.next = curr;
            curr = next;
            next = temp;
        }
        return curr;
    }
}
//        Stack<Integer> stapel = new Stack<>();
//        while (head!=null){
//            stapel.add(head.val);
//            head = head.next;
//        }
//        ListNode oplossing;
//        ListNode hulp;
//        oplossing=hulp=new ListNode();
//        while (!stapel.isEmpty()){
//            oplossing.next = new ListNode(stapel.pop());
//            oplossing = oplossing.next;
//        }
//        return hulp.next;
//    }

// better, not mine
//        if (head == null) return head;
//        ListNode curr = head;
//        ListNode next = curr.next;
//        ListNode temp;
//        curr.next = null;
//        while (next != null) {
//          temp = next.next;
//          next.next = curr;
//          curr = next;
//          next = temp;
//        }
//        return curr;
//        }

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return val + " " + next;
    }

}