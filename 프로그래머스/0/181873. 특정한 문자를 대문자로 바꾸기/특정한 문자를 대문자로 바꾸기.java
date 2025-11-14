class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String[] temp = my_string.split("");
		for(int i = 0; i < temp.length; i++) {
			if(temp[i].equals(alp)) {
				temp[i] = temp[i].toUpperCase();
			}
		}
		for(int i = 0; i < temp.length; i++) {
			answer += temp[i];
		}
        return answer;
    }
}