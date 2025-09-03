class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String str1 = "";
        String str2 = "";
         for(int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 1) {
                str1 += String.valueOf(num_list[i]);
            } else {
            	str2 += String.valueOf(num_list[i]);
            }
        }
        int num1 = Integer.valueOf(str1);
        int num2 = Integer.valueOf(str2);
        answer = num1 + num2;
        return answer;
    }
}