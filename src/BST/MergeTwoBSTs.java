package BST;

import java.util.ArrayList;

//linear time
public class MergeTwoBSTs {

    public void mergeTwoBSTsMain(BST.Node root1,BST.Node root2 ){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        inOrderBST(root1,list1);
        inOrderBST(root2,list2);

        ArrayList<Integer> sortedList =  mergeTwoArrayList(list1,list2);

        buildBST(sortedList ,0, sortedList.size()-1);

    }

    private BST.Node buildBST(ArrayList<Integer> sortedList,int si,int end) {
        if (si>end){
            return null;
        }

        int mid = (si+end)/2;
        BST.Node node = new BST.Node(sortedList.get(mid));
        node.left = buildBST(sortedList,si,mid-1);
        node.right = buildBST(sortedList,mid+1,end);
        return node;

    }

    private ArrayList<Integer> mergeTwoArrayList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> sList = new ArrayList<>();
        int i =0,j =0,k =0;
        while (i<list1.size() && j<list2.size()){
            if(list1.get(i)<list2.get(j)){
                sList.add(list1.get(i));
                i++;
            }else{
                sList.add(list2.get(j));
                j++;
            }
        }

        while (i< list1.size()){
            sList.add(list1.get(i));
            i++;
        }

        while (j<list2.size()){
            sList.add(list2.get(j));
            j++;
        }

        return sList;
    }

    private void inOrderBST(BST.BST.Node root, ArrayList<Integer> list1) {
        if (root == null){
            return;
        }

        inOrderBST(root.left,list1);
        list1.add(root.data);
        inOrderBST(root.right,list1);
    }
}
