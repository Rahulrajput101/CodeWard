package linked_list;

import stack.PalidromeLinkedListUsingStack;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        //Linked List
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
       head.next.next.next = new ListNode(5);
       // head.next.next.next.next = new ListNode(6);
       // head.next.next.next.next.next = new ListNode(4);
        //head.next.next.next.next.next.next = new ListNode(7);
      //  head.next.next.next.next.next.next.next = new ListNode(8);
      //  head.next.next.next.next.next.next.next.next = new ListNode(9);
      //  head.next.next.next.next.next.next.next .next.next= new ListNode(10);

//        DeleteNNodesAfterMNodes deleteNNodesAfterMNodes = new DeleteNNodesAfterMNodes();
//        deleteNNodesAfterMNodes.DeleteNNodesMain(head);

//        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
//        oddEvenLinkedList.oddEvenList(head);

        PalidromeLinkedListUsingStack palidromeLinkedListUsingStack = new PalidromeLinkedListUsingStack();
        boolean isPalindrome = palidromeLinkedListUsingStack.PalindromeLLStackMain(head);
        System.out.println( "isPalindrome" + isPalindrome);

    }
    public static void main2(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");
        linkedList.add("Element 4");

        // Print the elements of the LinkedList
        System.out.println("LinkedList elements:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
