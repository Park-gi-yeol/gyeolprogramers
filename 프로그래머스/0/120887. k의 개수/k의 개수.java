class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String num = "";
		for(int a = i; a <= j; a++) {
			num = String.valueOf(a);
		    for(int b = 0; b < num.length(); b++) {
                if(num.charAt(b) == (char)(k +'0')) {
                    answer += 1;
                }
            }
		}
        return answer;
    }
}