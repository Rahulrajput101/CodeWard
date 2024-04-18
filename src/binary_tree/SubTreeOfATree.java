package binary_tree;

public class SubTreeOfATree {

    public boolean isSubTree(BinaryTreeMain.Node root, BinaryTreeMain.Node subRoot){
        if (subRoot == null)
            return true;
        if (root == null){
            return false;
        }

        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }

//        boolean leftAns = isSubTree(root.left,subRoot);
//        boolean rightAns = isSubTree(root.right,subRoot);

       // return leftAns || rightAns;
        return isSubTree(root.left,subRoot) || isSubTree(root.right,subRoot);
    }

    public boolean isIdentical(BinaryTreeMain.Node root , BinaryTreeMain.Node subRoot){
        if(root == null && subRoot == null){
            return true;
        } else if (root == null || subRoot == null || root.data != subRoot.data) {
            return false;
        }


        if (!isIdentical(root.left,subRoot.left)){
            return false;
        }

        if (!isIdentical(root.right,subRoot.right)){
            return false;
        }

        return true;
    }
}
