import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> ltk = new ArrayList<Integer>();
        int i = 0;
		while (true) {
			if (ltk.isEmpty()) {
				ltk.add(arr[i]);
				i += 1;
			} 
			if (ltk.get(ltk.size() - 1) < arr[i]) {
				ltk.add(arr[i]);
				i += 1;
			}
			else {
				ltk.remove(ltk.size() - 1);
			}
			if (i > arr.length-1) {
				break;
			}
		}
            return ltk;
    }
}