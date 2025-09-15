class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] arr = my_string.toCharArray();
        for(int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (ch >= 'A' && ch <= 'Z' ) {
				answer[ch - 65]++;
			}else {
				answer[ch - 71]++;
			}
		}
        return answer;
    }
}