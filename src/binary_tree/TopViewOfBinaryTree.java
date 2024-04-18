package binary_tree;

import javax.swing.text.StyleContext;
import java.util.*;

public class TopViewOfBinaryTree {

    public static class Info{
        BinaryTreeMain.Node node;
        int hd;

        public Info(BinaryTreeMain.Node node,int hd){
            this.node = node;
            this.hd = hd;
        }

    }
    public List<Integer> topViewMain(BinaryTreeMain.Node root){
        List<Integer> result = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        Queue<Info> queue = new LinkedList<>();
        queue.add(new Info(root,0));
        queue.add(null);

        int max = 0,min = 0;


        while (!queue.isEmpty()){

            Info curr = queue.remove();
            if(curr == null){
                if(!queue.isEmpty()){
                    queue.add(null);
                }else {
                    break;
                }
            }else {
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node.data);
                }
                if (curr.node.left != null){
                    queue.add(new Info(curr.node.left,curr.hd -1));
                    min = Math.min(min,curr.hd-1);
                }

                if (curr.node.right != null){
                    queue.add(new Info(curr.node.right,curr.hd+1));
                    max = Math.max(max,curr.hd+1);
                }

            }
        }

        for(int i = min; i<= max; i++){
            result.add(map.get(i));
        }
      //  result = map.values().stream().toList();
        System.out.println(max +"and "+ min);
        return result;


    }
}
