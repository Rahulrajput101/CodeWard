package BST;

public class SortedListToBalancedBST {
    public BST.Node sortedArrayToBST(int[] nums) {
        return createBST(nums,0,nums.length-1);
    }

    public BST.Node createBST(int[] nums , int st, int end){
        if(st>end){
            return null;
        }

        int mid = (st + end)/2;
        BST.Node node = new BST.Node(nums[mid]);
        node.left = createBST(nums,st,mid-1);
        node.right = createBST(nums,mid+1,end);

        return node;

    }
}
