public class BinarySearch {

    public void searchElement(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = 8;
        int left = 0;
        int right = arr.length-1;

        while(left <= right){

            int mid = left + (right - left)/2;

            if( arr[mid] == n){
                System.out.println("found" + n);
            }

            if(arr[mid] < n){
                left += 1;
            }else{
                right -= 1;
            }


        }

        System.out.println("not found");
    }
}
