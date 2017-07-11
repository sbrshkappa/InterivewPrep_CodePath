public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int kthsmallest(final int[] A, int B) {
        int[] arr = new int[B];
        int numElements = 0;
        for(int i = 0; i<A.length; i++){

            if(numElements == 0){
                arr[0] = A[0];
                numElements++;
                //System.out.println("Number of Elements in the Array " + numElements);
                continue;
            } else if(numElements < B){
                int l = numElements;
                while(l > 0 && arr[l-1] > A[i]){
                    arr[l] = arr[l-1];
                    l--;
                }
                arr[l] = A[i];
                numElements++;
                //System.out.println("Number of Elements in the Array " + numElements);
                continue;
            } else {
                int x = B-1;
                while(x > 0 && A[i] < arr[x]){
                    if(arr[x-1] > A[i]){
                        arr[x] = arr[x-1];
                        x--;
                        continue;
                    }
                    arr[x] = A[i];
                    break;
                }
                if(arr[x] > A[i])
                    arr[x] = A[i];
            }

        }
       // System.out.println(Arrays.toString(arr));
        //System.out.println("The kth smallest element is " + arr[B-1]);
        return arr[B-1];
    }
}
