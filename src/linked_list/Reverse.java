package linked_list;

public class Reverse {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextE;

        while(curr != null){
            nextE = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextE;
        }
        head = prev;

        return head;
    }
}
