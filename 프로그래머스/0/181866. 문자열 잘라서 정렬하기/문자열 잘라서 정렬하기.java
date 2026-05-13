import java.util.*;
class Solution {
    public ArrayList<String> solution(String myString) {
        ArrayList<String> list = new ArrayList<String>();
		
		String[] arr = myString.split("x");
		for (String s : arr) {
			if(!s.equals("")) {
				list.add(s);
			}
		}
		Collections.sort(list);
        return list;
    }
}