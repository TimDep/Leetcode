import java.util.ArrayList;
import java.util.Collections;
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
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 =new ListNode(2, new ListNode(3, new ListNode(4)));
//        ListNode l1 = new ListNode();
//        ListNode l2 = new ListNode();
        System.out.println(mergeTwoLists(l1,l2).toString());
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode oplossing;
        ListNode hulp;
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        while (list1 != null){
            l1.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null){
            l2.add(list2.val);
            list2 = list2.next;
        }
        l1.addAll(l2);
        Collections.sort(l1);
        oplossing = hulp = new ListNode();
        for (Integer i : l1){
            oplossing.next =new ListNode(i);
            oplossing = oplossing.next;

        }
        return hulp.next;
    }
}