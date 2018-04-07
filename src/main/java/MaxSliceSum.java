public class MaxSliceSum {
    public static void main(String[] args) {
        int[] sample = {3,2,-6,4,0};
        if (5 == new Solution().solution(sample)) {
            System.out.println("succeed");
        }else {
            System.out.println("fail");
        }
    }

    //https://app.codility.com/demo/results/trainingBAJPRG-SQX/
   static class Solution {
        public int solution(int[] A) {
            // write your code in Java SE 8

            int maxElement = A[0];
            int nonNegativeSliceSum = 0;
            int positiveSliceResult = 0;
            for(int i = 0; i < A.length; i++){
                maxElement = Math.max(maxElement, A[i]);
                positiveSliceResult = Math.max(0, positiveSliceResult + A[i]);
                nonNegativeSliceSum = Math.max(nonNegativeSliceSum, positiveSliceResult);
            }
            if(maxElement <= 0){
                return maxElement;
            }

            return Math.max(maxElement,nonNegativeSliceSum);
        }
    }
}
