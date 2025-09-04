class Solution {
    public int[] solution(int[] num_list) {
        int[] arr = new int[num_list.length];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = num_list[i];
        }
        
        // answer 배열: 기존 요소 + 마지막 계산값
        int[] answer = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        // 마지막 요소 계산
        if(arr[arr.length - 1] > arr[arr.length - 2]) {
            answer[arr.length] = arr[arr.length -1] - arr[arr.length -2];
        } else {
            answer[arr.length] = arr[arr.length -1] * 2;
        }
        
        return answer;
    }
}