import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(n);
        while(true) {
            if(n % 2 == 0) {
				n = n /2;
				arr.add(n);
				} else {
					n = 3 * n + 1;
					arr.add(n);
			}
            if(n == 1) {
                break;
            }
        }
        return arr;
    }
}