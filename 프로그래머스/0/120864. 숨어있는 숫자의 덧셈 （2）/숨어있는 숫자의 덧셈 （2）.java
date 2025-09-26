import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        ArrayList<String> arr = new ArrayList<String>();
		String my_string1 = my_string.toLowerCase();
		my_string1 = my_string1.replaceAll("[^0-9]", " ");
		my_string1 = my_string1.trim();
		String[] arr2 = my_string1.split(" ");
        for(String a : arr2) {
			if(!a.equals("")) {
				answer += Integer.parseInt(a);
			}
		}
        return answer;
    }
}