import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
class Solution {
    public ArrayList<Integer> solution(String my_string) {
        char[] arr1 = my_string.toCharArray();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		String str1 = "";
		for(int i = 0; i < my_string.length(); i++) {
			if(arr1[i] < 'A') {
				arr2.add(arr1[i] - '0');
			}
		}
		Collections.sort(arr2);
        
        return arr2;
    }
}