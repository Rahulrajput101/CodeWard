package BST;

import java.util.ArrayList;

public class CovertBSTToBalanceBST {
    public BST.Node balanceBST(BST.Node root) {
        ArrayList<Integer> list = new ArrayList<>();

        inOrder(root,list);
        return buildBalanceBST(list, 0, list.size()-1);
    }

    public void inOrder(BST.Node root, ArrayList<Integer> list){
        if(root == null){
            return ;
        }

        inOrder(root.left,list);
        list.add(root.data);
        inOrder(root.right,list);
    }

    public BST.Node buildBalanceBST(ArrayList<Integer> list, int st, int end){
        if(st>end){
            return null;
        }
        int mid = (st + end)/2;
        BST.Node node = new BST.Node(list.get(mid));
        node.left = buildBalanceBST(list,st,mid-1);
        node.right = buildBalanceBST(list,mid+1,end);
        return node;
    }
}
