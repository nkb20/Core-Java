package DSA.Sorting.slidingWindow;

class Solution {
//    public static int minSubArrayLen(int target, int[] nums) {
//
//        int maxsum = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] >= target) {
//                return 1;
//            }
//            if(nums.length==1){
//                return 0;
//            }
//        }
//
//        int wsize = 2;
//
//        while (wsize <= nums.length) {
//            int wsum = 0;
//            for (int i = 0; i < wsize; i++) {
//                wsum += nums[i];
//            }
//            if (wsum >= target) {
//                return wsize;
//            }
//            else if (wsize==(nums.length)){
//                wsize=0;
//                return wsize;
//            }
////            maxsum = wsum;
//            for (int end = wsize; end < nums.length ; end++) {
//                wsum += nums[end] - nums[end - wsize];
//                if (wsum >= target) {
//                    return wsize;
//                }
//
//            }
//            wsize++;
//
//        }
//        return wsize;
//
//    }


        public static int minSubArrayLen(int target, int[] nums) {
            int ans = nums.length+1;
            int sum = 0;
            int st = 0;
            for(int i=0;i<nums.length;i++){
                sum += nums[i];
                while(sum >= target && st <= i){
                    ans = Math.min(ans , i - st + 1);
                    sum -= nums[st++];
                }
            }
            return ans==nums.length+1?0:ans;

    }
}

public class MinimumSizeArray {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5};
        System.out.println(Solution.minSubArrayLen(16,nums));

    }

}
