package heap;

public class HeapMain {

    public static void main(String[] args){
//        int[] arr = {1,1,2,4,3,5,3};
//        HeapSort heapSort = new HeapSort();
//        heapSort.heapSortMain(arr);
//
//
//        System.out.println("sorted : ");
//        for (int j : arr) {
//            System.out.println(j);
//        }

        int[] arr = {2,3,3,4,6};
        MinimumCostToConnectNRopes minimumCostToConnectNRopes = new MinimumCostToConnectNRopes();
       int totalCost =  minimumCostToConnectNRopes.minCostToReturnMain(arr);
        System.out.println(totalCost);
    }
}
