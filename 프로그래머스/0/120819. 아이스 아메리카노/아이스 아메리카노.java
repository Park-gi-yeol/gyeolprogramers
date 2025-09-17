class Solution {
    public int[] solution(int money) {
        int num1 = money / 5500;
        int num2 = money % 5500;
        int[] answer = {num1, num2};
        
        return answer;
    }
}