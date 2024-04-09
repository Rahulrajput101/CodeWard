package linked_list;

/*
We have a linked list and two integers M and N. Traverse the linked list such that you retain M
nodes then delete next N nodes, continue the same till end of the linked list. Difficulty Level:
Rookie.
Sample Input 1 : M=2 N=2 LL: 1->2->3->4->5->6->7->8
Sample Output 1 : 1->2->5->6
Sample Input 2 : M=3 N=2 LL: 1->2->3->4->5->6->7->8->9->10
Sample Output 2 : 1->2->3->6->7->8
 */
public class DeleteNNodesAfterMNodes {
    public void DeleteNNodesMain(ListNode node){
        ListNode dummy = new ListNode(0);
        dummy.next = node;
        ListNode prev = dummy;
        ListNode curr = node;
        int M = 2,N = 2;
        int countN = N;
        int i = 0;

        while (curr != null){
            if(i == M){
                while(countN != 0 && curr != null){
                    curr = curr.next;
                    countN--;
                }
                prev.next = curr;
                i=0;
                countN=N;
            }else{
                i++;
                prev = curr;
                curr = curr.next;
            }
        }
        ListNode temp = dummy.next;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
