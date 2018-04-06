public class MaxProfit {

    public static void main(String[] args){
        int[] input = {23171, 21011, 21123, 21366, 21013, 21367};
        if(356 ==  new Solution().solution(input)){
            System.out.println("succeed");
        }else{
            System.out.println("fail");
        }
    }

//https://app.codility.com/demo/results/trainingVN72TA-GE3/
    static class Solution {
        public int solution(int[] A) {
            // write your code in Java SE 8
            if(null == A || A.length < 2){
                return 0;
            }
            int  nonNegativeSum = 0;
            int maxResult = 0;
            for(int i = 1; i < A.length; i++){
                int diff = A[i] - A[i-1];
                nonNegativeSum = Math.max(0,nonNegativeSum + diff);
                maxResult = Math.max(nonNegativeSum, maxResult);
            }

            return maxResult;
        }
    }
}
