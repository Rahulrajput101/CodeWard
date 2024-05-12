package BST;

public class SizeOfLargestBSTSubtree {

    static class Info{
        Boolean isBST;
        int size;
        int min;
        int max;

        public Info(Boolean isBST, int size, int min ,int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    static int largestSize = 0;

    public void largestSubtreeMain(BST.Node root){
        largestBStSubtree(root);
        System.out.println(largestSize);
    }

    public Info largestBStSubtree(BST.Node root){
        if (root == null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info leftInfo = largestBStSubtree(root.left);
        Info rightInfo = largestBStSubtree(root.right);

        int size = leftInfo.size + rightInfo.size +1;
        int min = Math.min(leftInfo.min, Math.min(rightInfo.min,root.data));
        int max = Math.max(rightInfo.max, Math.max(rightInfo.max,root.data));
        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false,size,min,max);
        }
        if (leftInfo.isBST && rightInfo.isBST){
            largestSize = Math.max(largestSize,size);
            return new Info(true,size,min,max);
        }

        return new Info(false,size,min,max);

    }
}
