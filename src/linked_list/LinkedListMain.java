package linked_list;

public class LinkedListMain {
    public static void main(String[] args) {
        //Linked List
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(7);
      //  head.next.next.next.next.next.next.next = new ListNode(8);
      //  head.next.next.next.next.next.next.next.next = new ListNode(9);
      //  head.next.next.next.next.next.next.next .next.next= new ListNode(10);

//        DeleteNNodesAfterMNodes deleteNNodesAfterMNodes = new DeleteNNodesAfterMNodes();
//        deleteNNodesAfterMNodes.DeleteNNodesMain(head);

        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
        oddEvenLinkedList.oddEvenList(head);
    }
}
