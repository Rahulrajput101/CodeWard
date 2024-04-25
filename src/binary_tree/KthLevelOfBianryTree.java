package binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KthLevelOfBianryTree {
    public void kthLevel(BinaryTreeMain.Node root, int k){

        if (root == null || k <=0){
            return;
        }

        Queue<BinaryTreeMain.Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int count = 1;
        k--;
        //k = k-1;
        while (!queue.isEmpty()){

            BinaryTreeMain.Node curr = queue.remove();
            if (curr == null){
                if(!queue.isEmpty()){
                  //  count= count+1;
                    k--;
                    queue.add(null);
                }else {
                    break;
                }
            }else{
                if(k==0){
                    System.out.println(curr.data);
                }
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if (curr.right != null){
                    queue.add(curr.right);
                }
            }
        }


    }

    public void kthLevelByRecursion( BinaryTreeMain.Node root, int k){
        ArrayList<Integer> list = new ArrayList<>();
        kthLevelRec(root,k,list,1);
        System.out.println(list);
    }

    private void kthLevelRec(BinaryTreeMain.Node root, int k, ArrayList<Integer> list,int count) {
        if (root == null){
            return;
        }

        if( count ==k){
            list.add(root.data);
            return;
        }
        kthLevelRec(root.left,k,list,count+1);
        kthLevelRec(root.right, k, list,count+1);
    }

}
