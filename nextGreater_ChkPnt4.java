public class Solution {
    public int[] nextGreater(int[] A) {
        int j;
        for(int i = 0; i < A.length; i++){
            j = i+1;
            for(; j < A.length; j++){
                if(A[j] > A[i]){
                    A[i] = A[j];
                    break;
                }
            }
            if(j == A.length){
                A[i] = -1;
            }
        }

        return A;
    }
}
