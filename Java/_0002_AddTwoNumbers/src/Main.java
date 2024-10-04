import javax.swing.*;

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
    public String toString(){
        return val + " " + next;
    }
}

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3, new ListNode(7));
        ListNode l2 = new ListNode(9, new ListNode(2));
        System.out.println(addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int temp=0;
        int tiener = 0;
        ListNode hulp;
        ListNode oplossing;
        hulp= oplossing= new ListNode();
        while(l1!=null && l2!=null){
            int value= l1.val + l2.val+temp;
            if (value>=10){
                value-=10;
                tiener=1;

            }
            else{
                tiener=0;
            }
            oplossing.next = new ListNode(value);
            if (tiener==1){
                temp=1;
            }
            else {
                temp=0;
            }
            oplossing = oplossing.next;
            l1=l1.next;
            l2=l2.next;
        }
        while (l1!=null){
            int value=l1.val+temp;
            if (value>=10){
                value-=10;
                tiener=1;

            }
            else{
                tiener=0;
            }
            oplossing.next = new ListNode(value);
            if (tiener==1){
                temp=1;
            }
            else {
                temp=0;
            }
            oplossing = oplossing.next;
            l1=l1.next;
        }
        while (l2!=null){
            int value=l2.val+temp;
            if (value>=10){
                value=l2.val+temp;
                value-=10;
                tiener=1;

            }
            else{
                tiener=0;
            }
            oplossing.next = new ListNode(value);
            if (tiener==1){
                temp=1;
            }
            else {
                temp=0;
            }
            oplossing = oplossing.next;
            l2=l2.next;
        }
        if (temp==1){
            oplossing.next=new ListNode(temp);
        }
        return hulp.next;
    }
}