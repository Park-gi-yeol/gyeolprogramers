class Solution {
    public int solution(String number) {
        int answer = 0;
		int[] arr1 = new int[number.length()];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = number.charAt(i) - '0';
			System.out.println(arr1[i]);
		}
		for(int i = 0; i < arr1.length; i++) {
			answer += arr1[i];
		}
        answer = answer % 9;
        return answer;
    }
}