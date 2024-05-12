package BST;

public class BSTMain {
    public static class Node{
        int data;
        BST.Node left;

        BST.Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args){
        BST.Node root = new BST.Node(5);
        root.left = new BST.Node(1);
        root.left.right = new BST.Node(3);
        root.left.right.right = new BST.Node(4);
        root.left.right.left= new BST.Node(2);
        root.right = new BST.Node(7);
        root.right.right = new BST.Node(9);

        BST.Node root2 = new BST.Node(8);
        root2.left = new BST.Node(5);
        root2.left.left = new BST.Node(3);
        root2.left.right = new BST.Node(6);
        root2.right = new BST.Node(10);
        root2.right.right = new BST.Node(11);
        root2.right.right.right = new BST.Node(14);

        BST.Node root3 = new BST.Node(50);
        root3.left = new BST.Node(30);
        root3.left.left = new BST.Node(5);
        root3.left.right = new BST.Node(20);

        root3.right = new BST.Node(60);
        root3.right.left = new BST.Node(45);
        root3.right.right = new BST.Node(70);
        root3.right.right.right = new BST.Node(80);
        root3.right.right.left = new BST.Node(65);

       // BST.inOrder(node);
//        SearchBST searchBST = new SearchBST();
//        Boolean isFound =searchBST.searchBSTMain(root,7);
//        System.out.println(isFound);

//        PrintRange printRange = new PrintRange();
//        printRange.printRangeMain(root,3,7);
      //  BST.inOrder(root);

//        RootToLeafpath rootToLeafpath = new RootToLeafpath();
//        rootToLeafpath.rootToLeafPathMain(root2);

        SizeOfLargestBSTSubtree sizeOfLargestBSTSubtree = new SizeOfLargestBSTSubtree();
        sizeOfLargestBSTSubtree.largestSubtreeMain(root3);
    }
}
