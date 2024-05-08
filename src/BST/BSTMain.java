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

       // BST.inOrder(node);
//        SearchBST searchBST = new SearchBST();
//        Boolean isFound =searchBST.searchBSTMain(root,7);
//        System.out.println(isFound);

//        PrintRange printRange = new PrintRange();
//        printRange.printRangeMain(root,3,7);
      //  BST.inOrder(root);

        RootToLeafpath rootToLeafpath = new RootToLeafpath();
        rootToLeafpath.rootToLeafPathMain(root2);
    }
}
