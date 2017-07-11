public class Solution {

    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

    public void swap(int[] arr, int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public ArrayList<Integer> convertArrayToList(int[] num){
        ArrayList<Integer> item = new ArrayList<Integer>();
    	for (int x = 0; x < num.length; x++) {
    		item.add(num[x]);
    	}
	    return item;
    }

    private boolean containsDuplicate(int[] arr, int start, int end) {
    	for (int i = start; i <= end-1; i++) {
    		if (arr[i] == arr[end]) {
    			return false;
    		}
    	}
	    return true;
    }

    public int[][] permuteRecursive(int[] arr, int start, int end){

        if(start >= end){
            ArrayList<Integer> newRow = convertArrayToList(arr);
            result.add(newRow);
        } else {

            for(int j = start; j < arr.length; j++){
                if(containsDuplicate(arr, start, j)){
                    swap(arr, start, j);
                    permuteRecursive(arr,start+1,end);
                    swap(arr, start, j);
                }

            }
        }

        int[][] arrayResult = new int[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            ArrayList<Integer> row = result.get(i);
            //int[] arrayRow = new int[row.size()];
            for(int j = 0; j < row.size(); j++){
                arrayResult[i][j] = row.get(j);
            }
        }
        return arrayResult;
    }

    public int[][] permute(int[] A) {

       return permuteRecursive(A,0,A.length-1);

    }
}
