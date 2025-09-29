import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
class Solution {
    public ArrayList<String> solution(String my_str, int n) {
        String[] answer = {};
        int i =0;
		int j = n;
        String my_string = "";
        ArrayList<String> arr = new ArrayList<String>();
		while(true) {
			if(my_str.length() - i <= n) {
				my_string = my_str.substring(i);
			}else {
				my_string = my_str.substring(i,j);
			}
			arr.add(my_string);
			i += n;
			j += n;
			if(i >= my_str.length()) {
				break;
			}
		}
        return arr;
    }
}