package linked_list;

public class IntersectionOfNodes {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {


            //  ListNode tempA = headA;
            // while(tempA != null){
            //      ListNode tempB = headB;
            //    while(tempB != null){
            //      if(tempA == tempB){
            //         return tempA;
            //      }else{
            //          tempB = tempB.next;
            //      }
            //    }
            //       tempA = tempA.next;
            // }

            // return tempA;


            int lengthA = getLengthOfListNode(headA);
            int lengthB =  getLengthOfListNode(headB);

            while( lengthA > lengthB){
                headA = headA.next;
                lengthA--;
            }

            while( lengthA < lengthB){
                headB = headB.next;
                lengthB--;
            }

            while(headA != headB){
                headA = headA.next;
                headB = headB.next;
            }

            return headA;




        }

        public int getLengthOfListNode(ListNode node){
            int length = 0;
            while( node != null){
                length++;
                node = node.next;
            }
            return length;
        }

        //3rd
        //   if (headA == null || headB == null) return null;

        // // Pointers for both lists
        // ListNode pointerA = headA;
        // ListNode pointerB = headB;

        // // Traverse both lists until they meet or reach the end (null)
        // while (pointerA != pointerB) {
        //     // If pointerA reaches the end of listA, move it to the head of listB
        //     if (pointerA == null) {
        //         pointerA = headB;
        //     } else {
        //         pointerA = pointerA.next;
        //     }

        //     // If pointerB reaches the end of listB, move it to the head of listA
        //     if (pointerB == null) {
        //         pointerB = headA;
        //     } else {
        //         pointerB = pointerB.next;
        //     }
        // }

        // // At this point, pointerA and pointerB either meet at the intersection node or both are null
        // return pointerA;
    }


