import Others.*;
import linked_list.ListNode;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Queue

//        InterleaveTwoHalves interleaveTwoHalves = new InterleaveTwoHalves();
//        Queue<Integer> q = new LinkedList<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        q.add(5);
//        q.add(6);
//        q.add(7);
//        q.add(8);
//        q.add(9);
//        q.add(10);
//        interleaveTwoHalves.interLeaveTwoHalvesMain(q);
//        while (!q.isEmpty()){
//            System.out.print(q.remove() + " ");
 //       }

//        FirstNonRepeatingCharacter firstNonRepeatingCharacter = new FirstNonRepeatingCharacter();
//        firstNonRepeatingCharacter.firstNotRepeatingMain("aabccxb");
//        QueueUsing2Stacks queueUsing2Stacks = new QueueUsing2Stacks();
//         queueUsing2Stacks.push(1);
//         queueUsing2Stacks.push(2);
//         queueUsing2Stacks.push(3);
//
//        System.out.println(queueUsing2Stacks.pop());
//        System.out.println(queueUsing2Stacks.peek());


//        int[] a = {1,2,3,4,5};
//        int[] b = {6,7,8,9,10};
//        TestArray testArray = new TestArray();
//
//        int[] result =  testArray.sortArrayAndMerge(a,a.length,b, b.length);
//
//          for(int i = 0 ; i<= result.length-1; i++){
//              System.out.println(result[i]);
//          }


     //Stack
//        PushAtTheBottomOFStack pushAtTheBottomOFStack = new PushAtTheBottomOFStack();
//        pushAtTheBottomOFStack.stack();
//
        //Reverse The string using Stack
//        ReverseTheString reverseTheString = new ReverseTheString();
//        reverseTheString.ReverseString();

        //Reverse The stack
//        ReverseStack reverseStack = new ReverseStack();
//         reverseStack.reverseStackMain();

        //SpanStock
//        StockSpan stockSpan = new StockSpan();
//        stockSpan.stockSpanMain();

        //NextGreaterElement
//        NextGreaterElement nextGreaterElement = new NextGreaterElement();
//        nextGreaterElement.nextGreaterElementMain();


    //    {
            //MergeSort
//        MergeSort mergeSort = new MergeSort();
//        mergeSort.mergeSortArray();

            //Selection sort

//       SelectionSort selectionSort = new SelectionSort();
//        selectionSort.sortTheList();

            //BinarySearch
//        BinarySearch binarySearch = new BinarySearch();
//        binarySearch.searchElement();

            //Gcd of Strings
//       String str1 = "ABCABC";
//       String str2 = "ABC";
//
//        GcdOfStrings gcd = new GcdOfStrings();
//        String result = gcd.gcdOfStrings(str1,str2);
//        System.out.println(result);

//        KidsWithCandies kidsWithCandies = new KidsWithCandies();
//        kidsWithCandies.largestOddNumber("2347");

//       String word1 = "abc";
//       String word2 = "pqr" ;
//        MergeTwoStringAlternatively mergeTwoStringAlternatively =  new MergeTwoStringAlternatively();
//        String mergedString = mergeTwoStringAlternatively.mergeAlternately(word1,word2);
//        System.out.println(mergedString);
//        System.out.println("run");
//      Solution  solution  = new Solution();
//       int [] nums1 = {2,0};
//       int m = 1;
//        int [] nums2 = {1};
//        int n = 1;
//       int[] newSolve =  solution.merge(nums1 ,m, nums2,n);
//      for( int num : newSolve){
//          System.out.println(num + " ");
//      }

            //rotate array
//         int [] nums1 = {1,2,3,4,5,6,7};
//         int k = 3;
//         RotateArraySolution rotateArraySolution = new RotateArraySolution();
//         rotateArraySolution.rotate(nums1,k);

//         Test test = new Test();
//          int [] arr = test.rotateArray(nums1,k);
//           for( int  num : arr){
//               System.out.print(num + " ");
//           }

            //majority element
//        int [] nums = {1,2,1,4,1,6,1};
//        MajorityElement majorityElement = new MajorityElement();
//       int majElement =  majorityElement.majorElement(nums);
//        System.out.println(majElement);

            //jump
//        int [] nums = {3,0,8,2,0,0,1};
//
//        Jump jump = new Jump();
//        boolean b = jump.canJump(nums);
//        System.out.println(b);


            //WordPattern
//        String pattern = "abba";
//        String s = "dog cat cat dog";
//        WordPattern wordPattern = new WordPattern();
//        wordPattern.wordPattern(pattern,s);

            //String comparision

//        char[] chars = {'a','a','b','b','c','c','c'};
//        StringComparision s = new StringComparision();
//         int v = s.compress(chars);
//        System.out.println(v);

            //
//        ReverseVowels vo = new ReverseVowels();
//        vo.reverseVowels("");

            //Max consecutive
//        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
//
//        MaxCons maxCons = new MaxCons();
//         maxCons.longestOnes(nums,2);


            //Linked List
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(1);
//        head.next.next = new ListNode(2);
//        head.next.next.next = new ListNode(2);
//        head.next.next.next.next = new ListNode(3);
//
//        // Create an instance of RemoveDuplicateFromSortedList
//          RemoveDuplicateFromSortedList2 remover = new RemoveDuplicateFromSortedList2();
//
//        // Call deleteDuplicates to remove duplicates
//        ListNode result = remover.deleteDuplicates(head);
//        // Print the list after removing duplicates
//        System.out.println("List after removing duplicates:");
//        printList(result);
    //    }

        ScoreOfString scoreOfString = new ScoreOfString();
        scoreOfString.scoreOfStringMain();

    }

    // Helper method to print the linked list
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

}