import java.util.ArrayList;
class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        ArrayList<Character> arr = new ArrayList<Character>();
        
        for(int i = 0; i < my_string.length(); i++) {
			arr.add(my_string.charAt(i));
		}
        for(int j = 0; j < index_list.length; j++) {
			answer +=(arr.get(index_list[j]));
		}
        return answer;
    }
}