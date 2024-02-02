package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public void mergeSortArray(){
        int[] arr = {2,4,3,1,5,6,8,7};
        System.out.println(Arrays.toString(arr));
        mergerSort(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    //Dividing the array in sorted parts
    private void mergerSort(int[] arr, int si, int ei) {

        if(si >= ei){
            return;
        }
        int mid =  si+(ei-si)/2;
        mergerSort(arr, si, mid);
        mergerSort(arr,mid+1,ei);

        mergeTheArray(arr, si, mid,ei);
    }

    private void mergeTheArray(int[] arr, int si, int mid, int ei) {
        System.out.println("called");
        int [] temp =  new int[ei -si +1]; //size
        int i = si;
        int j = mid+1;
        int k = 0;

        while (i<= mid && j<= ei){
            if ( arr[i] > arr[j]){
                temp[k] = arr[j];
                 j++;
            }else{
                temp[k] = arr[i];
                 i++;
            }
            k++;
        }


        while (i <= mid){
            temp[k++] = arr[i++];
        }

        while (j<=ei){
            temp[k++] = arr[j++];
        }

        //copy the sorted array

        for( int  s= 0,h =si; s< temp.length; s++,h++){
            arr[h] = temp[s];
        }
    }
}
