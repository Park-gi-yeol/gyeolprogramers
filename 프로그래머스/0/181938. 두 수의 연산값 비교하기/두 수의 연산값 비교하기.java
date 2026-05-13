class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        answer = ((Integer.valueOf(String.valueOf(a) + String.valueOf(b))) > 2 * a * b)
				? (Integer.valueOf(String.valueOf(a) + String.valueOf(b))) : 2 * a * b;
        return answer;
    }
}