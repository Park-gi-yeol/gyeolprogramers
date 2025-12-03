class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] str = binomial.split(" ");
		int a = Integer.valueOf(str[0]);
		int b = Integer.valueOf(str[2]);
		String op = str[1];
		
		if(op.equals("+")) {
			answer = a+b;
		} else if (op.equals("-")) {
			answer = a-b;
		} else {
			answer = a*b;
		}
        return answer;
    }
}