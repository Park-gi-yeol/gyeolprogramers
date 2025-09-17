class Solution {
    public int solution(int n) {
        int answer = 0;
        String st = String.valueOf(n);
		char[] arr = st.toCharArray();
		int[] arr2 = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i] - '0';
			answer += arr2[i];
			
		}
        return answer;
    }
}