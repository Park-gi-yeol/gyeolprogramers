import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
class Solution {
    public int[] solution(int[] emergency) {
        
		
		int[] answer = new int[emergency.length];
        int[] emergency1 = emergency.clone();
		
		
		Arrays.sort(emergency1);
		for(int i = 0; i < emergency1.length; i++) {
			for(int j = 0; j < emergency.length; j++) {
				if(emergency1[i] == emergency[j]) {
					answer[i] = emergency.length - j;
				}
			}
		}
		

        return answer;
    }
}