class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int[] sum = {0,0};
		
		for(int i = 0; i < num_list.length; i++) {
			sum[i%2] += num_list[i];
		}
		answer = Math.max(sum[0], sum[1]);
        return answer;
    }
}