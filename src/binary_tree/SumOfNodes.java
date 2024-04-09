package binary_tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class SumOfNodes {
    public int sumOfNodesMain(BinaryTreeMain.Node root){
        if (root == null){
            return 0;
        }

        int leftSum = sumOfNodesMain(root.left);
        int rightSum = sumOfNodesMain(root.right);

        return leftSum + rightSum + root.data;
    }
}
