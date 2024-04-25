package binary_tree;

public class TransformToSumTree {
    public void transformSumTreeMain(BinaryTreeMain.Node node){
        System.out.println( "pre : ");
        preOrderTraverse(node);
         tranfromTheTree(node);
        System.out.println( "post : ");
        preOrderTraverse(node);

    }

    public  void preOrderTraverse(BinaryTreeMain.Node node){//o(n)
        if (node == null){
            System.out.print("-1 ");
            return;
        }
        System.out.print(node.data+ " ");
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    private int tranfromTheTree(BinaryTreeMain.Node node) {
        if(node == null){
            return 0;
        }

        int leftSum = tranfromTheTree(node.left);
        int rightSum = tranfromTheTree(node.right);
        int v = node.data;
        node.data = leftSum+rightSum;
        return leftSum+rightSum+v;
    }

}
