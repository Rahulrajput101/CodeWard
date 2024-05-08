package BST;

public class DeleteNode {

    public void deleteNodeMain(BST.Node node, int val) {

        deleteNode(node, val);

    }

    private BST.Node deleteNode(BST.Node node, int val) {
        if (node  == null) {
            return null;
        }
        if (node.data < val) {
            deleteNode(node.right, val);
        } else if (node.data > val) {
            deleteNode(node.left, val);
        } else { //Voila

            //case 1 leaf node
            if (node.left == null && node.right == null) {
                return null;
            }

            //case 2 one child
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            //case 3 both children
            BST.Node IS =findInOrderSucessor(node.right);
            node.data = IS.data;
            node.right = deleteNode(node.right, IS.data);
        }
        return node;
    }

    private BST.Node findInOrderSucessor(BST.Node root) {
        while (root.left != null){
            root = root.left;
        }

        return root;
    }
}
