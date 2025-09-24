class Solution {
    public String solution(int age) {
        String answer = "";
        String str1 = String.valueOf(age);
		int[] arr1 = new int[str1.length()];
		for(int i = 0; i < str1.length(); i++) {
			answer +=(char)(str1.charAt(i) + 49);
		}
        return answer;
    }
}