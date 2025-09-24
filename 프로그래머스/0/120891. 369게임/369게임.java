class Solution {
    public int solution(int order) {
        int answer = 0;
        String st1 = String.valueOf(order);
		String[] arr = st1.split("");

		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("3") || arr[i].equals("6") || arr[i].equals("9")) {
				answer += 1;
			}
		}
        return answer;
    }
}