package BST;

public class PrintRange {

    public void printRangeMain(BST.Node node, int k1,int k2){
         inRange(node,k1,k2);
    }

    private void inRange(BST.Node node, int k1, int k2) {
       if(k1 < node.data  && k2 > node.data){
           System.out.println(node.data);
           inRange(node.left, k1,k2);
           inRange(node.right, k1,k2);
       }

       if(k1> node.data){
           System.out.println(node.data);
           inRange(node.left,k1,k2);
       }
    }

}
