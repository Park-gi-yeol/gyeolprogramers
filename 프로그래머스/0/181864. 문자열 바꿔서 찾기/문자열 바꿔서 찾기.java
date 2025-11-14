class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String[] temp = myString.split("");
		for(int i = 0; i < temp.length; i++) {
			if(temp[i].equals("A")) {
				temp[i] = "B";
			} else {
				temp[i] = "A";
			}
		}
		String st= String.join("",temp);
		if(st.contains(pat)) {
			answer = 1;
		} else {
			answer = 0;
		}
        return answer;
    }
}