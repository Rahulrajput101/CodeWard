package BST;

public class SearchBST {

    public Boolean searchBSTMain(BST.Node node, int el){

        if (node == null){
            return false;
        }
        if(node.data == el){
            return true;
        }
        if(node.data > el){
           Boolean isFoundLeft=  searchBSTMain(node.left,el);
           return isFoundLeft;
        }else{
            Boolean isFoundRight=  searchBSTMain(node.right,el);
            return isFoundRight;
        }
    }
}
