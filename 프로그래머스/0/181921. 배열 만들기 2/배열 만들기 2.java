import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = l; i <= r; i++) {
			String d = String.valueOf(i);
			if(!d.contains("1") && !d.contains("2") && !d.contains("3") && !d.contains("4")
					&& !d.contains("6") && !d.contains("7") && !d.contains("8") && !d.contains("9")  )
			{
				arr.add(i);
			}
		}
        if(arr.isEmpty()) {
				arr.add(-1);
			}
         answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}