package linked_list;

public class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {

        ListNode prev = node;
        ListNode curr = node.next;
        if(curr != null){
            node.val = curr.val;
            node.next = curr.next;
        }
    }
}
