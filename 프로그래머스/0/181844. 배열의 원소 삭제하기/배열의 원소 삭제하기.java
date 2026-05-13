import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
		for(int i : arr) {
			answer.add(i);
		}
		for(int i = 0; i < delete_list.length; i++) {
			if(answer.contains(delete_list[i])) {
				answer.remove((Integer)delete_list[i]);
			}
		}
        return answer;
    }
}