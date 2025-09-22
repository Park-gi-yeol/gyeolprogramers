import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] arr1 = my_string.toCharArray();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		for(int i = 0; i < my_string.length(); i++) {
			if(arr1[i] < 'A') {
				arr2.add(arr1[i] - '0');
			}
		}
		
		for(int i = 0; i < arr2.size(); i++) {
			answer += arr2.get(i);
		}
        return answer;
    }
}