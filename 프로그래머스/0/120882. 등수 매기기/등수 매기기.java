

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
class Solution {
    public int[] solution(int[][] score) {
        Integer[] answer = new Integer[score.length];
		int[] answer3 = new int[score.length];
		for(int i = 0; i < score.length; i++) {
			int sum = 0;
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
			answer[i] = sum;
		}
        Integer[] answer2 = answer.clone();
		Arrays.sort(answer,Collections.reverseOrder());
		for (int i = 0; i < answer2.length; i++) {
		    for (int j = 0; j < answer.length; j++) {
		        if (answer2[i].equals(answer[j])) {
		            answer3[i] = j + 1; // 등수는 1부터 시작
		            break;
		        }
		    }
        }
        return answer3;
    }
}