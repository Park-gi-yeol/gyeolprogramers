import java.util.ArrayList;
class Solution {
    public ArrayList<String> solution(String my_string) {
        ArrayList<String> answer = new ArrayList<String>();
		my_string = my_string.trim();
		String[] str = my_string.split(" ");
		
		for(String a : str) {
			if (!a.equals("")) {
				answer.add(a);
			}
		}
        return answer;
    }
}