import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int[] arr2 = new int[arr.length];
        ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		for (int i = 0; i < queries.length; i++) {
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			int j =0;
			int num1 = queries[i][j];
			int num2 = queries[i][++j];
			int num3 = queries[i][++j];
			for(int k = num1; k <= num2; k++ ) {
				if(k % num3 == 0) {
					arr2[k] = arr2[k] + 1;
				}
			}
		}
		for(int i = 0; i < arr2.length; i++) {
			list2.add(arr2[i]);
		}
        return list2;
    }
}