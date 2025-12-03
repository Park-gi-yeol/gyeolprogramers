import java.util.ArrayList;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
	
		for(int i = 0; i < finished.length; i++) {
			if(finished[i]==false) {
				arr.add(i);
			}
		}
        	String[] answer = new String[arr.size()];
		for(int i = 0; i < arr.size(); i++) {
			for(int j =0; j < todo_list.length; j++) {
				if(arr.get(i) == j) {
					answer[i] = todo_list[j]; 
				}
			}
		}
        return answer;
    }
}