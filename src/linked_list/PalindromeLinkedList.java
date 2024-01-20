package linked_list;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null){
            return true;
        }
        ListNode mid = findMid(head);

        ListNode prev = null;
        ListNode curr = mid;
        ListNode nextE;

        while(curr != null){
            nextE = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextE;
        }
        ListNode right = prev;
        ListNode left = head;

        while(right != null){
            if(left.val == right.val){
                left = left.next;
                right = right.next;
            }else{
                return false;
            }
        }

        return true;

    }

    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
