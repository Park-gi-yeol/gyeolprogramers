class Solution {
    public String solution(String code) {
        String answer = "";
        String[] arr = code.split("");
		int mode = 0;
		for(int i =0; i < arr.length; i++) {
			
			if(mode == 0) {
				if(!arr[i].equals("1")) {
					if(i % 2 == 0) {
						answer += arr[i];
					}
				} else {
					mode = 1;
				}
			} else {
				if(!arr[i].equals("1")) {
					if(i % 2 == 1) {
						answer += arr[i];
					}
				} else {
					mode = 0;
				}
			}
			
		}
		if (answer.isEmpty()) {
			answer = "EMPTY";
		} 
        return answer;
    }
}