
public class MaxDoubleSliceSum {

    public static void main(String[] args) {
        int[] example = {3, 2, 6, -1, 4, 5, -1, 2};
        int result = new Solution().solution(example);
        if(result != 17){
            System.err.println("fail");
        }else{
            System.out.println("succeed");
        }
    }

    static class Solution {
        public int solution(int[] A) {
            // write your code in Java SE 8
            if(3 == A.length){
                return 0;
            }

            int[] forwardOrder = new int[A.length - 2];
            int maxPeriodSum = 0;
            forwardOrder[0] = 0;
            for(int i = 1; i < forwardOrder.length; i++){
                maxPeriodSum = Math.max(0, maxPeriodSum + A[i]);
                forwardOrder[i] = maxPeriodSum;
            }

            int[] reverseOrder = new int[A.length - 2];
            maxPeriodSum = 0;
            reverseOrder[reverseOrder.length - 1] = 0;
            for(int i = reverseOrder.length - 2; i >= 0; i--){
                maxPeriodSum = Math.max(0, maxPeriodSum + A[i+2]);
                reverseOrder[i] = maxPeriodSum;
            }

            int max = 0;//Math.max(reverseOrder[1],forwardOrder[forwardOrder.length - 2]);
            for(int i = 0; i < forwardOrder.length; i++){
                max = Math.max(max, forwardOrder[i] + reverseOrder[i]);
            }

            return max;
        }
    }
}
