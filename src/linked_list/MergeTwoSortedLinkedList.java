package linked_list;

public class MergeTwoSortedLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode newNode = new ListNode(Integer.MIN_VALUE);
        ListNode curr1 = list1;
        ListNode curr2 = list2;

        ListNode headNode = newNode;

        while(curr1 != null && curr2 != null){
            if(curr1.val > curr2.val){
                newNode.next = curr2;
                curr2 = curr2.next;
            }else{
                newNode.next = curr1;
                curr1 = curr1.next;
            }

        }



//        if( curr1 == null){
//            while(curr2 != null){
//                newNode.next = curr2;
//                curr2 = curr2.next;
//            }
//        }else{
//            while(curr1 != null){
//                newNode.next = curr1;
//                curr1 = curr1.next;
//            }
//        }

        //Directly add the remaining nodes
        if (curr1 == null) {
            newNode.next = curr2;
        } else {
            newNode.next = curr1;
        }

        return headNode.next;
    }
}
