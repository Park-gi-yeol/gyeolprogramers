class Solution {
    public String solution(String myString) {
        String answer = "";

		String[] str = myString.split("");
		
		for(int i = 0; i < str.length; i++) {
			if(str[i].equalsIgnoreCase("a")) {
				str[i] = str[i].toUpperCase();
			} else {
				str[i] = str[i].toLowerCase();
			}
		}
		for(String a : str) {
			answer += a;
		}
        return answer;
    }
}