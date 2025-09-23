class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] arr1 = cipher.split("");
		
		for(int i = 0; i < arr1.length+1; i++) {
			if(i % code == 0 && i > 0) {
				answer += arr1[i - 1];
			}
		}
        return answer;
    }
}