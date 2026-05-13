class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String as = String.valueOf(a) + String.valueOf(b);
		String bs = String.valueOf(b) + String.valueOf(a);
		answer = (Integer.valueOf(as) > Integer.valueOf(bs)) ?  Integer.valueOf(as) : Integer.valueOf(bs);
        return answer;
    }
}