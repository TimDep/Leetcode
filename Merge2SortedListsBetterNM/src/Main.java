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

        // check if ListNode is null
        if(list1==null) return list2;
        else if(list2==null) return list1;

        // create temporary List(Head) and copy those List
        ListNode res=new ListNode();
        ListNode ptr1=list1;
        ListNode ptr2=list2;

        // copy lowest list to temporary list and update to new node on ptr
        if(ptr1.val>ptr2.val){
            res= ptr2;
            ptr2=ptr2.next;
        }else{
            res= ptr1;
            ptr1=ptr1.next;
        }

        // copy temporary List(Head) and use this new List(tail) as a pointer (running next node)
        ListNode resPtr=res;

        // Loop copy lowest list to tail List and update to new node on ptr
        while(ptr1!=null && ptr2!=null){
            if(ptr1.val>ptr2.val){
                resPtr.next= ptr2;
                resPtr=resPtr.next;
                ptr2=ptr2.next;
            }else{
                resPtr.next= ptr1;
                resPtr=resPtr.next;
                ptr1=ptr1.next;
            }
        }

        // when one of ptr is at the end node, then copy the remain List that in not null
        if(ptr1==null) resPtr.next=ptr2;
        else resPtr.next= ptr1;

        // return Head
        return res;
    }
}