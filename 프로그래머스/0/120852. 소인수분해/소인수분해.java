import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
class Solution {
    public ArrayList<Integer> solution(int n) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<Integer>();
		int num = 2;
		while(n != 1) {
			if(n % num == 0) {
				if(!arr.contains(num)) {
					arr.add(num);
				}
				
				n = n/num;
				num = 2;
				continue;
			}

			num++;
		}
        return arr;
    }
}