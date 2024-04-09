package binary_tree;

import java.util.LinkedList;
import java.util.Queue;

//time complexity = 0(n)
public class BinaryTreesB {

    static class Node {
        int data;
        Node left;
        Node right;


        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
        static class BinaryTree{
            static int idx = -1;
            public static Node buildTree( int[] nodes){
                idx++;

                if(nodes[idx] == -1){
                    return null;
                }

                Node newNode = new Node(nodes[idx]);
                 newNode.left = buildTree(nodes);
                 newNode.right = buildTree(nodes);

                 return newNode;
            }

            public static void preOrderTraverse(Node  node){//o(n)
               if (node == null){
                   System.out.print("-1 ");
                   return;
               }
                System.out.print(node.data+ " ");
                preOrderTraverse(node.left);
                preOrderTraverse(node.right);
            }

            public static void inOrderTraverse(Node node){
                if (node == null){
                    return;
                }
                inOrderTraverse(node.left);
                System.out.print(node.data+ " ");
                inOrderTraverse(node.right);
            }

            public static void postOrderTraversal(Node node){
                if(node == null){
                    return;
                }

                postOrderTraversal(node.left);
                postOrderTraversal(node.right);
                System.out.print(node.data +" ");
            }

            public static void levelOrder(Node node){

                if (node == null){
                    return;
                }

                Queue<Node> queue = new LinkedList<>();
                queue.add(node);
                queue.add(null);
                while ( !queue.isEmpty()){
                    Node currNode = queue.remove();
                    if(currNode == null){
                        if(!queue.isEmpty()){
                            System.out.println();
                            queue.add(null);
                        }else {
                            break;
                        }

                    }else{
                        System.out.print(currNode.data+" ");
                        if (currNode.left != null){
                            queue.add(currNode.left);
                        }
                        if (currNode.right != null){
                            queue.add(currNode.right);
                        }
                    }
                }
            }

        }

        public static void main(String[] args){
            int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
             BinaryTree binaryTree = new BinaryTree();
              Node root = binaryTree.buildTree(nodes);
              BinaryTree.levelOrder(root);

        }

}
