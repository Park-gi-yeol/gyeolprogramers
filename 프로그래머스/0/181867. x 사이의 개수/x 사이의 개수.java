import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(String myString) {
        String[] str = myString.split("x",-1);
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for(int i = 0; i < str.length; i++) {
			answer.add(str[i].length());
		}
        return answer;
    }
}