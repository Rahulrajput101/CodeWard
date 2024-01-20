package sorting;

public class SelectionSort {

    public void sortTheList(){

        int[] arr= {1,5,3,4,2};

        for(int i = 0; i<arr.length-1; i++){
            int minPos  = i;

            for( int j =i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }

            //Swap
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }


        for(int e : arr){
            System.out.print(e);
        }
    }
}
