class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        answer = (!my_string.endsWith(is_suffix)) ? 0: 1;
        return answer;
    }
}