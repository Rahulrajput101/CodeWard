package linked_list;

public class MergeSortInLinkedList {

    public ListNode mergeSortLL(ListNode head){

        if(head == null || head.next == null){
            return head;
        }

        ListNode mid =findMiddle(head);
        ListNode right = mid.next;
        mid.next = null;

        ListNode newLeft = mergeSortLL(head);
        ListNode newRight = mergeSortLL(right);

        return merge(newLeft, newRight);
    }

    public ListNode merge(ListNode head1 , ListNode head2){
        ListNode node = new ListNode(-1);
        ListNode temp = node;

        while(head1 != null && head2 != null){
            if(head1.val <= head2.val){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        if (head1 != null) {
            temp.next = head1;
        } else {
            temp.next = head2;
        }

        return node.next;

    }

    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

}
