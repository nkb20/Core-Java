package DSA.Sorting.slidingWindow;

public class LongestSubarray {
    //Sum of longest SubArray
    public static int MaxSum(int[] num, int k) {
//        int Msum=0;
//        for(int i=0;i<=num.length-k;i++){
//            int wsum=0;
//            for(int j=i;j<k+i;j++){
//                wsum+=num[j];
//            }
//            Msum=Math.max(wsum,Msum);
//        }
//        return Msum;

        int wsum = 0;

        for (int i = 0; i < k; i++) {
            wsum += num[i];
        }
        int msum=wsum;
        for (int i = k; i <=num.length - 1; i++) {
            int end = i ;
            wsum += num[end] - num[end - k];
            msum = Math.max(msum, wsum);
        }

        return msum;
    }

    public static void main(String[] args) {
        int[] num = {0,6,5,4,3,1,0,2,5};
        int k = 3;
        System.out.println(MaxSum(num, k));



    }
}
