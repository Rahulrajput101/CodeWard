package linked_list;

public class SwappingNode {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast= dummy;
        ListNode slow = dummy;

        for( int i = 0; i<k; i++){
            fast = fast.next;
        }

        ListNode first = fast;

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }


        int temp = first.val;
        first.val = slow.val;
        slow.val = temp;

        return dummy.next;
    }
}
