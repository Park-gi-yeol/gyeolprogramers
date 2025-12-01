class Solution {
    public String solution(String n_str) {
        String answer = "";
        String[] str = n_str.split("");
        if(str[0].equals("0")) {
			for(int i = 0; i < str.length; i++) {
				if(str[i].equals("0")) {
					str[i] = "";
				} else {
					break;
				}
			}
			for(String a : str) {
				answer += a;
			}
		}else {
			answer = n_str;
		}
		answer = answer.strip();
        return answer;
    }
}