class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] arr1 = my_string.split("");
		
		answer = arr1[num1];
		arr1[num1] = arr1[num2];
		arr1[num2] = answer;
		
        answer = "";
		for(int i = 0; i < arr1.length; i++) {
            answer += arr1[i];
        }
        return answer;
    }
}