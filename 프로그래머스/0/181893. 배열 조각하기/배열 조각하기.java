import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = arr;
		
		for(int i = 0; i < query.length; i++) {
			if(i % 2 == 0) {
				answer = Arrays.copyOf(answer, query[i] + 1);
				System.out.println(answer.length);
				System.out.println();
			} else {
				answer = Arrays.copyOfRange(answer, query[i], answer.length);
				System.out.println(answer.length);
				System.out.println();
			}
		}
        return answer;
    }
}