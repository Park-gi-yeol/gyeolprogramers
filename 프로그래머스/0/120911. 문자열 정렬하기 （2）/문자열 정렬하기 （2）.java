import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
		String[] arr = my_string.split("");
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
        return answer;
    }
}