package binary_tree;

import javax.swing.tree.TreeNode;

public class DiameterOfBinaryTree {

    public static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public void dbtMain(BinaryTreeMain.Node  node){

        int diameter = diameter2(node).diam;
        System.out.println(diameter);


    }

    //0(n2)
    public int diameter(BinaryTreeMain.Node node){
        if(node == null){
            return 0;
        }

        int leftDiam = diameter(node.left);
        int leftHeight = height(node.left);
        int rightDiam = diameter(node.right);
        int rightHeight = height(node.right);
        int selfDiam = leftHeight+rightHeight +1;
        if(leftDiam > rightDiam){
            return  Math.max(leftDiam,selfDiam);
        }else{
            return Math.max(rightDiam,selfDiam);
        }

    }

    //0(n)
    public Info diameter2(BinaryTreeMain.Node  node) {

        if (node == null){
            return new Info(0,0);
        }
        Info leftInfo = diameter2(node.left);
        Info rightInfo = diameter2(node.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht +1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;

        return new Info(diam, ht);
    }


    public int height(BinaryTreeMain.Node node){
        if (node == null){
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.max(leftHeight,rightHeight)+1;
    }



}
