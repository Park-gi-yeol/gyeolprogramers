class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer =0;
		if(my_string.length() >= is_suffix.length()) {
			String sub = my_string.substring(my_string.length() - is_suffix.length());
			if(sub.equals(is_suffix)) {
				answer = 1;
			}
		} else {
			answer = 0;
		}
        return answer;
    }
}