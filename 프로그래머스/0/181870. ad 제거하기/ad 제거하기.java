import java.util.ArrayList;
class Solution {
    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<String>();
		
		for(String a : strArr) {
			if(!a.contains("ad")) {
				answer.add(a);
			}
		}
        return answer;
    }
}