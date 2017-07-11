public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestConsecutive(final int[] A) {

        HashSet<Integer> hTable = new HashSet<Integer>();
        int maxLength = 0;
        for(int i=0; i < A.length; i++){
            hTable.add(A[i]);
        }

        for(int i = 0; i < A.length; i++){

            if(!hTable.contains(A[i]-1)){
                int j = A[i];
                while(hTable.contains(j)){
                    j++;
                }

                if(maxLength < j-A[i]){
                    maxLength = j-A[i];
                }
            }
        }
        return maxLength;
    }
}
