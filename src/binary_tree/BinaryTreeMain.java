package binary_tree;

import java.util.ArrayList;
import java.util.List;

//In kotlin
//class BinaryTreeMain {
//    class Node(var data: Int) {
//        var left: Node? = null
//        var right: Node? = null
//    }
//
//    companion object {
//        @JvmStatic
//        fun main(args: Array<String>) {
//            // Your main function code here
//        }
//    }
//}
public class BinaryTreeMain {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args){
        Node root = new Node(3);
        root.left = new Node(9);
       // root.left.left = new Node(4);
       // root.left.right = new Node(5);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
//        HeightOfBinaryTree heightOfBinaryTree = new HeightOfBinaryTree();
//        int height = heightOfBinaryTree.heightOfBinaryTreeMain(root);
//        System.out.println(height);

//        SumOfNodes sumOfNodes = new SumOfNodes();
//        int sum = sumOfNodes.sumOfNodesMain(root);
//        System.out.println(sum);
        Node subRoot = new Node(2);
        subRoot.left= new Node(4);
        subRoot.right = new Node(5);

//        DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();
//        diameterOfBinaryTree.dbtMain(root);

//        SubTreeOfATree subTreeOfATree = new SubTreeOfATree();
//         boolean isSubtree = subTreeOfATree.isSubTree(root,subRoot);
//        System.out.println(isSubtree);
//        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
//        System.out.println(levelOrderTraversal.levelOrder(root));

        TopViewOfBinaryTree topViewOfBinaryTree = new TopViewOfBinaryTree();
        List<Integer> list = new ArrayList<>();
        list = topViewOfBinaryTree.topViewMain(root);
        System.out.println(list);
    }


}
