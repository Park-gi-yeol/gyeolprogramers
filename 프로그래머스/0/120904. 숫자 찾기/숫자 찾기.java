class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = String.valueOf(num);
		String[] arr = str.split("");
		String str2 = String.valueOf(k);
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(str2)) {
				answer = i+1;
                break;
			}
		}
		if(answer <= 0 ) {
			answer = -1;
        }
        return answer;
    }
}