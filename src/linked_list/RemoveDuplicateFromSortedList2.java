package linked_list;

public class RemoveDuplicateFromSortedList2 {
    public ListNode deleteDuplicates(ListNode head) {


        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        while(curr != null){
            boolean isDuplicate = false;
            while(curr.next != null && curr.val == curr.next.val){
                isDuplicate = true;
                curr = curr.next;
            }

            if(isDuplicate){
                prev.next = curr.next;
                curr = curr.next;
            }else{
                prev = prev.next;
                curr = curr.next;
            }

        }

        return dummy.next;


    }
}
