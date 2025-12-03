import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
		
		int[] arr1 = new int[intervals[0][1] - intervals[0][0] + 1];
		int[] arr2 = new int[intervals[1][1] - intervals[1][0] + 1];
		int j = 0;
		for(int i = intervals[0][0]; i < intervals[0][1]+1; i++) {
			arr1[j] = arr[i];
			j++;
		}
		j = 0;
		for(int i = intervals[1][0]; i < intervals[1][1]+1; i++) {
			arr2[j] = arr[i];
			j++;
		}
		for(int i = 0; i < arr1.length; i++) {
			answer.add(arr1[i]);
		}
		for(int i = 0; i < arr2.length; i++) {
			answer.add(arr2[i]);
		}
        return answer;
    }
}