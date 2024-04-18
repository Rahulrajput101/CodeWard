package stack;

import linked_list.ListNode;

import java.util.Stack;

public class PalidromeLinkedListUsingStack {
    public boolean PalindromeLLStackMain(ListNode node){
        if (node == null || node.next == null) {
            return true; // Empty list or single node list is a palindrome
        }
         ListNode curr = node;
        Stack<Integer> stack = new Stack<>();

        while (curr != null){
            stack.push(curr.val);
            curr =  curr.next;
        }

        while (node != null){
            int el = stack.pop();
            System.out.println("node " + node.val+ " stack " + el);
            if (node.val == el){
                node = node.next;
            }else {
                return false;
            }
        }
        return true;
    }
}
