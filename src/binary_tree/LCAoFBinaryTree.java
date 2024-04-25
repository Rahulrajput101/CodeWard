package binary_tree;

import java.util.ArrayList;

public class LCAoFBinaryTree {
    public  BinaryTreeMain.Node lcaMain( BinaryTreeMain.Node root, int n1 , int n2 ){

        ArrayList<BinaryTreeMain.Node> path1 = new ArrayList<>();
        ArrayList<BinaryTreeMain.Node> path2 = new ArrayList<>();
        getPath(root, n1,path1);
        getPath(root, n2,path2);


        int i = 0;
        for(;  i<path1.size() && i<path2.size(); i++){
            System.out.println(i);
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        BinaryTreeMain.Node lca = path1.get(i-1);
        return lca;

    }

    public Boolean getPath(BinaryTreeMain.Node node , int n, ArrayList<BinaryTreeMain.Node> list){

        if (node == null){
            return false;
        }
      //  System.out.println(list.size());
        list.add(node);
        if(node.data == n){
            return true;
        }

        Boolean foundLeft = getPath(node.left,n,list);
        Boolean foundRight = getPath(node.right, n, list);

        if (foundLeft || foundRight){
            return true;
        }

        list.remove(list.size()-1);

        return false;

    }

    //Approach 2 to is 0(n) but less space complexity
    public BinaryTreeMain.Node lowestCommonAncestor(BinaryTreeMain.Node root,BinaryTreeMain.Node p, BinaryTreeMain.Node q) {

        if(root == null || root == p || root == q){
            return root;
        }
        BinaryTreeMain.Node leftLca =  lowestCommonAncestor(root.left,p,q);
        BinaryTreeMain.Node rightLca =  lowestCommonAncestor(root.right,p,q);

        if(leftLca == null){
            return rightLca;
        }
        if(rightLca == null){
            return leftLca;
        }
        return root;
    }


}
