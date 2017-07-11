public class Solution {
    public int numRange(int[] A, int B, int C) {
        int count = 0;
        for(int i = 0; i < A.length; i++){
            int sum = 0;
            for(int j = i; j < A.length; j++){
                sum += A[j];
                if(B <= sum && sum <= C){
                    count++;
                } else if(sum > C){
                    break;
                }
            }
        }
        return count;
    }
}
