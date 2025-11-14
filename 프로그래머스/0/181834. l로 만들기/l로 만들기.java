class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] temp = myString.toCharArray();
		
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] < 'l') {
				temp[i] = 'l';
			}
		}
		for(int i = 0; i < temp.length; i++) {
			answer += String.valueOf(temp[i]);
		}
        return answer;
    }
}