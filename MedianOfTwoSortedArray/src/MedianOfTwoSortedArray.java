import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        findMedianSortedArrays(nums1, nums2);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        int mid = 0;
        int[] mergedArray = getMergedArray(nums1, nums2);
        Arrays.sort(mergedArray);
        if(mergedArray.length % 2 == 0) {
            mid = mergedArray.length / 2;
            median = ((double)mergedArray[mid] + (double)mergedArray[mid-1]) / (double)2;
        }
        else{
            mid = mergedArray.length / 2;
            median = mergedArray[mid];
        }

        return median;
    }

    public static int[] getMergedArray(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        boolean completeLoop = false;

        //For Insertion in a single loop.
        for(int i = 0, j = nums1.length, counter=0; !completeLoop ;i++, j++, counter++) {
            if (i< nums1.length){
                mergedArray[i] = nums1[i];
            }
            if(counter< nums2.length) {
                mergedArray[j] = nums2[counter];
            }
            if(i>= nums1.length && counter>=nums2.length){
                completeLoop = true;
            }
        }
        return mergedArray;
    }
}
