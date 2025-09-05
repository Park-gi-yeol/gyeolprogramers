import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] queries) {
        int[] answer = {};
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0; i < queries.length; i++) {
            ArrayList<Integer> list1 = new ArrayList<Integer>();
			int j = 0;
			int num1 = queries[i][j]; //
			int num2 = queries[i][++j];
			int num3 = queries[i][++j];
            for (int k = num1; k <= num2; k++) {
				if (arr[k] > num3) {
					list1.add(arr[k]);
				}
			}
            if(!list1.isEmpty()) {
				Collections.sort(list1);
				list2.add(list1.get(0));
			} else {
				list2.add(-1);
			}
        }
        return list2;
    }
}