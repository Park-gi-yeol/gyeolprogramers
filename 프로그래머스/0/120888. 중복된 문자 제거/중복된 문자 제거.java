import java.util.ArrayList;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str1 = my_string.split("");
		ArrayList<String> arr = new ArrayList<String>();
		for(int i = 0; i < str1.length; i++) {
			if(!arr.contains(str1[i])) {
				arr.add(str1[i]);
                answer += str1[i];
			}
		}
        return answer;
    }
}