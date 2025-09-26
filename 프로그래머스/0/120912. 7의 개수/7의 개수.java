import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String num = "";
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i = 0; i < array.length; i++) {
			num += String.valueOf(array[i]);
		}
		String[] arr2 = num.split("");
		for(String a : arr2) {
			if(a.equals("7")) {
				answer += 1;
			}
		}
        return answer;
    }
}