package binary_tree;

public class KthAncesstorOfNode {


    public void kthAncestor(BinaryTreeMain.Node root, BinaryTreeMain.Node n) {
        int i = getKthAncestor(root, n, 2);
        System.out.println(i);
    }

    public static class KthInfo{
        int count ;
        BinaryTreeMain.Node node ;

        public KthInfo(int c ,BinaryTreeMain.Node node ){
            this.count = c;
            this.node = node;
        }

    }




    private int getKthAncestor(BinaryTreeMain.Node node, BinaryTreeMain.Node n, int k) {
        if (node == null) {
            return -1;
        }
        if (node == n) {
            return 0;
        }

        int left = getKthAncestor(node.left, n, k);
        int right = getKthAncestor(node.right, n, k);


        if (left == -1 && right == -1) {
            return -1;
        }
        int max = Math.max(left, right);
        if (max + 1 == k) {
            System.out.println("found" + node.data);
            return max;
        }
        System.out.println("last " + node.data + " max is  " + max + 1);
        return max + 1;


    }


}
