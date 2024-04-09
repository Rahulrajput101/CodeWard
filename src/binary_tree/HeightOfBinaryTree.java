package binary_tree;

public class HeightOfBinaryTree {
    public int heightOfBinaryTreeMain(BinaryTreeMain.Node root){

        if(root == null){
            return 0;
        }
        int leftHeight = heightOfBinaryTreeMain(root.left);
         int rightHeight= heightOfBinaryTreeMain(root.right);

      return Math.max(leftHeight, rightHeight)+1;

        //this will give the count of nodes
        //return leftHeight+rightHeight+1;
    }
}
