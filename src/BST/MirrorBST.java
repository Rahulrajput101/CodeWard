package BST;

public class MirrorBST {

    public void mirrorBSTMain(BST.Node root){

         mirror(root);
    }

    private BST.Node mirror(BST.Node root) {
        if(root == null){
            return null;
        }

        BST.Node leftS = mirror(root.left);
        BST.Node rightS = mirror(root.right);

        root.left = rightS;
        root.right = leftS;

        return root;
    }
}
