import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(int[] arr) {
        int i = 0;
		List<Integer> answer = new ArrayList<>();
		
		for(int a = 0; a < arr.length; a++) {
			if(answer.isEmpty()) {
				answer.add(arr[a]);
			} else if (answer.get(answer.size() - 1) == arr[a]) {
				answer.remove(answer.size() - 1);
				i++;
			} else if (answer.get(answer.size() - 1) != arr[a]) {
				answer.add(arr[a]);
				i++;
			}
		}
        
        if(answer.isEmpty()) {
            answer.add(-1);
        }
        
        return answer;
    }
}