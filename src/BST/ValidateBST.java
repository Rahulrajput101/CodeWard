package BST;

public class ValidateBST {
    public boolean isValidBST(BST.Node root) {

        return findIsValid(root,null,null);
    }

    public boolean findIsValid(BST.Node root,BST.Node min, BST.Node max){

        if(root == null){
            return true;
        }
        //for right
        if(min != null && root.data <= min.data){
            return false;
        }

        //for left
        if(max != null && root.data >= max.data){
            return false;
        }

        return findIsValid(root.left,min,root) && findIsValid(root.right,root,max);
    }
}
