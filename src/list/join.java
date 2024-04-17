package list;
import java.util.Arrays;
class Solution {
    public static void merge(int nums1[], int m, int[] nums2, int n) {
        //i= indexing of Array nums1 (length-1)
        int i = m - 1;
        //j= indexing of Array nums2 (length-1)
        int j = n - 1;
        //Indexing of new Array nums1
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        //To print remaining elements from nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }

    }
}
public class join {
    public static void main(String[] args) {
        //Array of type integer nums1
        int[] nums1 = {1, 9, 10, 0, 0, 0};
        //Array of type integer nums2
        int[] nums2 = {5, 6, 8};
        // Size of nums1 excluding "0"
        int m = 3;
        // Size of nums2
        int n = 3;
        //Calling merge method which created inside Solution class
        Solution.merge(nums1, m, nums2, n);
        //Converting Array into String
        System.out.println(Arrays.toString(nums1));
    }
}