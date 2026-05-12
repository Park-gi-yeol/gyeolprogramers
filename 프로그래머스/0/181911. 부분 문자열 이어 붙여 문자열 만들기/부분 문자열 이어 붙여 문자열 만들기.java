class Solution {
    public String solution(String[] my_string, int[][] parts) {
        String answer = "";
            for(int i = 0; i < my_string.length; i++) {
			answer += my_string[i].substring(parts[i][0], parts[i][1] + 1);
		}
        return answer;
    }
}