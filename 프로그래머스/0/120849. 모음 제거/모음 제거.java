class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr2 = {"a","e","i","o","u"};
        
       for(int i = 0; i < arr2.length; i++) {
    	my_string = my_string.replace(arr2[i], "");
       }
        return my_string;
    }
}