import java.util.ArrayList;
class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
		int[] answer = new int[num_list.length];
		for(int i = n; i < num_list.length; i++) {
			arr.add(num_list[i]);
		}
		for(int i = 0; i < answer.length; i++) {
			if(i < arr.size()) {
				answer[i] = arr.get(i);
			} else {
				answer[i] = num_list[i - arr.size()];
			}
		}
         
        return answer;
    }
}