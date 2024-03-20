public class TestArray {

    public int[] sortArrayAndMerge(int a[] , int m , int b[] , int n){
        int[] newArray = new int[m+n];

        int i = 0;
        int  j =0;
        int k = 0;
        while(i<m && j<n){
            if(a[i]<=b[j]){
                newArray[k] = a[i];
                i++;
            }else{
                newArray[k] = b[j];
                j++;
            }
           k++;
        }


        while (i<m){
            newArray[k] = a[i];
            i++;
            k++;
        }

        while (j<n){
            newArray[k] = b[j];
            j++;
            k++;
        }

        return newArray;
    }

}
