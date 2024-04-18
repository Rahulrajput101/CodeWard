package binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(BinaryTreeMain.Node root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root==null){
            return result;
        }
        Queue<BinaryTreeMain.Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        List<Integer> currList = new ArrayList<>();
        while (!queue.isEmpty()){
            BinaryTreeMain.Node curr = queue.remove();

            if(curr == null){
                result.add(currList);
                if(!queue.isEmpty()){
                    currList = new ArrayList<>();
                    queue.add(null);
                }else {
                    break;
                }
            }else{
                currList.add(curr.data);
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if (curr.right != null){
                    queue.add(curr.right);
                }

            }
        }
        return result;
    }
}
