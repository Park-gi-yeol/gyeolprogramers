class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int i = 0; i < queries.length; i++) {
			String st = "";
			for(int j = queries[i][0]; j <= queries[i][1]; j++) {
				st += my_string.charAt(j);
			}
			String reversed = new StringBuilder(st).reverse().toString();
			my_string = my_string.substring(0, queries[i][0]) + reversed + my_string.substring(queries[i][1]+1);
		}
        
        return my_string;
    }
}