package binary_tree;

import java.util.ArrayList;

public class MinDistanceBetweenTwoNodes {

    public  int minDistanceOFNodes(BinaryTreeMain.Node root, BinaryTreeMain.Node n1 ,BinaryTreeMain.Node n2){

        BinaryTreeMain.Node lca = lca(root, n1, n2);
        //Approach 1 with space needed
//        ArrayList<BinaryTreeMain.Node> path1 = new ArrayList<>();
//        ArrayList<BinaryTreeMain.Node> path2 = new ArrayList<>();
//
//
//        getPath(lca, n1.data,path1);
//        getPath(lca, n2.data,path2);
//
//        int p1 =path1.size()-1;
//        int p2 = path2.size()-1;
//        return p1+p2;


        int dist1 =  minDistance(lca,n1);
        int dist2 = minDistance(lca,n2);

        return dist1+dist2;



    }

    private static int  minDistance(BinaryTreeMain.Node node, BinaryTreeMain.Node n1) {

        if (node == null){
            return -1;
        }

        if (node == n1){
            return 0;
        }

        int lftDist = minDistance(node.left, n1);
        int rightDist = minDistance(node.right, n1);

        if (lftDist == -1 && rightDist ==-1){
            return -1;
        }

        if (lftDist != -1){
            return lftDist+1;
        }
        return rightDist + 1;
    }

    public static Boolean getPath(BinaryTreeMain.Node node , int n, ArrayList<BinaryTreeMain.Node> list){

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

    public static BinaryTreeMain.Node lca (BinaryTreeMain.Node root, BinaryTreeMain.Node n1 ,BinaryTreeMain.Node n2){
        if(root == null || n1 == root || n2 == root){
            return root;
        }

        BinaryTreeMain.Node leftLca = lca(root.left, n1, n2);
        BinaryTreeMain.Node rightLca = lca(root.right, n1, n2);

        if (leftLca == null){
            return rightLca;
        }
        if (rightLca == null){
            return leftLca;
        }

        return root;

    }
}
