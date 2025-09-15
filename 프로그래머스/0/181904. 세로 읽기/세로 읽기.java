class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int num1 = 0;
        char[][] arr = new char[my_string.length()/m][m];
        for (int i = 0; i < arr.length; i++) {
			String st1 = "";
			st1 += my_string.substring(num1, num1+m);
			num1 += m;
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = st1.charAt(j);
			}
		
		}
		for(int i = 0; i < arr.length; i++) {
			answer += String.valueOf(arr[i][c-1]);
		}
        return answer;
    }
}