class Solution {
    public int solution(int n) {
        int j = 1;
        int answer = 0;
        while (true) {
			int sum = 1;
			for(int i = 1; i <= j; i++) {
				sum *= i;
			}
			if(sum > n) {
				answer = j-1;
				break;
			}
			j++;
		}
        return answer;
    }
}