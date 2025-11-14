class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = 0;
		if(num_list.length % n == 0) {
			length = num_list.length / n;
		} else {
			length = (num_list.length / n) + 1;
		}
		int[] answer = new int[length];
		
		int j = 0;
		for(int i = 0; i < num_list.length; i+=n) {
			answer[j] = num_list[i];
            System.out.println(j);      
			j++;
		}
        return answer;
    }
}