package linked_list;

public class DetectLoop {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast  = head;
        int occurance = 0;

        while(fast != null && fast.next != null){
            if( slow == fast){
                if(occurance >=1){
                    return true;
                }
                occurance++;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}
