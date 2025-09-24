import java.util.HashMap;
class Solution {
    public String solution(int age) {
        String answer = "";
        String str1 = String.valueOf(age);
		int[] arr1 = new int[str1.length()];
		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		for(int i = 97; i <= 120; i++ ) {
			map.put(i-97, (char)i);
		}
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = str1.charAt(i) - '0';
			answer += String.valueOf(map.get(arr1[i]));
		}
        return answer;
    }
}