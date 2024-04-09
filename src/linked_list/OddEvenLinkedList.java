package linked_list;

public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        ListNode oddDummy = new ListNode(0);
        ListNode evenDummy = new ListNode(0);
        ListNode odd = oddDummy;
        ListNode even = evenDummy;
        ListNode curr = head;

        int i = 1;
        while(curr != null){
            if( i%2 == 0){
                even.next = curr;
                even = even.next;
            }else{
                odd.next = curr;
                odd = odd.next;
            }
            i++;
            curr = curr.next;
        }

        even.next = null;
        odd.next = evenDummy.next;

        printDummyList(oddDummy.next);
        return oddDummy.next;
    }

    public void printDummyList(ListNode dummy) {
        ListNode current = dummy; // Start from the node after the dummy node
        while (current != null) {
            System.out.print(current.val + " "); // Print the value of the current node
            current = current.next; // Move to the next node
        }
        System.out.println(); // Print a new line after printing all the values
    }


    //optimum
    public ListNode oddEvenList2(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
}
