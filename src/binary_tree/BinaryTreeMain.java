package binary_tree;

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
    static class Node {
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
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
//        HeightOfBinaryTree heightOfBinaryTree = new HeightOfBinaryTree();
//        int height = heightOfBinaryTree.heightOfBinaryTreeMain(root);
//        System.out.println(height);

        SumOfNodes sumOfNodes = new SumOfNodes();
        int sum = sumOfNodes.sumOfNodesMain(root);
        System.out.println(sum);
    }


}
