class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int sub = Math.abs(n - array[0]);
		for(int i = 0; i < array.length; i++) {
			if(sub > Math.abs(n - array[i])) {
				sub = Math.abs(n - array[i]);
				answer = array[i];
			} else if (sub == Math.abs(n-array[i]) && answer > array[i]) {
                answer = array[i];
            }
		}
        return answer;
    }
}