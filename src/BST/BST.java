package BST;

public class BST {

     public static class Node{
        int data;
        Node left;

        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
         if (root== null){
            root = new Node(val);
            return root;
         }

         if (root.data > val){
             //left Subtree
             root.left= insert(root.left,val);
         }else{

             //right Subtree
             root.right= insert(root.right,val);

         }

         return root;

    }

    public static void inOrder(Node node){
         if (node == null){
             return;
         }
        inOrder(node.left);
        System.out.println(node.data + "");
        inOrder(node.right);

    }

    public static void main(String[] args){
     int [] values = {5,1,3,4,2,7};
     Node node = null;
     for (int  i = 0; i<values.length; i++){
         node =  insert(node, values[i]);
     }
     inOrder(node);
    }


}
