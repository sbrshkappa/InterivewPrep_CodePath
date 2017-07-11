public class Solution {
    public int[][] prettyPrint(int A) {
        int size = 2*A-1;
        int prettyMatrix[][] = new int[size][size];
        int top = 0 , left = 0, bottom = size-1, right = size-1;
        while (top <= bottom && left <= right){
            for(int i=top; i<=bottom; i++) {
                prettyMatrix[i][left] = A;
                prettyMatrix[i][right] = A;
            }
            for(int j=left; j<=right; j++) {
                prettyMatrix[top][j] = A;
                prettyMatrix[bottom][j] = A;
            }
            top++;left++;bottom--;right--;
            A--;
        }
        return prettyMatrix;
    }
}
