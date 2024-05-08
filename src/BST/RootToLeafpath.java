package BST;

import java.util.ArrayList;

public class RootToLeafpath {

    public void rootToLeafPathMain(BST.Node root){

        printRootToLeafPath(root,new ArrayList<Integer>());

    }

    private void printRootToLeafPath(BST.Node root, ArrayList<Integer> list) {

        if (root == null){
            return;
        }
        list.add(root.data);
        if(root.left == null && root.right == null){
            printPath(list);
        }


        printRootToLeafPath(root.left,list);
        printRootToLeafPath(root.right,list);
        list.remove(list.size()-1);

    }

    private void printPath(ArrayList<Integer> list) {
        for (int i = 0; i<=list.size()-1; i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
    }
}
