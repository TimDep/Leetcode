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
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        System.out.println(middleNode(l1));
    }

    public static ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode node = head;
        while(node != null){
            size++;
            node = node.next;
        }

        size /= 2;
        node = head;
        while(node != null && size > 0){
            size--;
            node = node.next;
        }
        return node;
    }
}