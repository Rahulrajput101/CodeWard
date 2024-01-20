class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int [] newArray = new int[m+n];

        int i = 0;
        int j = 0;
        int k =0;
        while( i<m && j<n ){
            if(nums1[i] <= nums2[j]){
                newArray[k] = nums1[i];
                i++;
            }else{
                newArray[k] = nums2[j];
                j++;
            }
            k++;

        }
        while(i<m){
            newArray[k] = nums1[i];
            i++;
            k++;
        }

        while(j<n){
            newArray[k] = nums2[j];
            j++;
            k++;
        }
      return newArray;
    }
}

//class Solution {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int[] newArray = new int[m + n];
//
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while (k < m + n) {
//
//            if (m == 0) {
//                newArray = nums2;
//                break;
//            }
//
//            if (n == 0) {
//                newArray = nums1;
//                break;
//            }
//
//            if (i >= m) {
//                newArray[k] = nums2[j];
//                j++;
//                k++;
//                continue;
//            }
//
//            if (j >= n){
//                newArray[k] = nums1[i];
//                i++;
//                k++;
//                continue;
//            }
//
//            if (nums1[i] <= nums2[j]) {
//                newArray[k] = nums1[i];
//                i++;
//                k++;
//            } else {
//                newArray[k] = nums2[j];
//                j++;
//                k++;
//            }
//        }
//        System.arraycopy(newArray, 0, nums1, 0, newArray.length);
//    }
//}