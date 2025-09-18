class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int num= 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                if(array[i] > array[j] && i != j) {
                    num = array[i];
                    array[i] = array[j];
                    array[j] = num;
                }
            }
        }
        answer = array[(array.length - 1) / 2];
        return answer;
    }
}