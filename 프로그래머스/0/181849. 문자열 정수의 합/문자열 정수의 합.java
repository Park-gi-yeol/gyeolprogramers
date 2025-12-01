class Solution {
    public int solution(String num_str) {
        String[] str = num_str.split("");
		int answer = 0;
		for(String a : str) {
			answer += Integer.valueOf(a);
		}
        return answer;
    }
}