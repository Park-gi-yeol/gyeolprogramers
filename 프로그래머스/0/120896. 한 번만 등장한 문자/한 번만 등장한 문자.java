import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
		ArrayList<String> arr2 = new ArrayList<String>();
		ArrayList<String> arr3 = new ArrayList<String>();
		ArrayList<String> arr4 = new ArrayList<String>();
		
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (!arr2.contains(arr[i])) {
				arr2.add(arr[i]); //abcd
			} else {
				arr3.add(arr[i]); // abcd를 제외한 나머지
			}
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(!(arr3).contains(s.charAt(i)+"")) {
				arr4.add(s.charAt(i)+"");
			}
		}
		Collections.sort(arr4);
		for(String a : arr4) {
			answer += a;
		}
        return answer;
    }
}