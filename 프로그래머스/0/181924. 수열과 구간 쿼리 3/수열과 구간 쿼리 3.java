class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int c= 0;
        int temp=0;
        int temp1=0;
        for(int i = 0; i < queries.length; i++) {
        	int j = 0;
        	temp =queries[i][j]; // 0
        	temp1 = queries[i][++j]; // 3
        	c = arr[temp];
        	arr[temp] = arr[temp1];
        	arr[temp1] = c;
        	 
        }
        return arr;
    }
}

