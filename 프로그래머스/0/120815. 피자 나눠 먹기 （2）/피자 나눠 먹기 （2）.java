class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 6;
        int i = 1;
		while (true) {
	 
			if(pizza * i % n == 0 && n!= 0) {
				answer = i;
				break;
			}
			i++;
		}
        return answer;
    }
}   