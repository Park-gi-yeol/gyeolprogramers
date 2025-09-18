class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] vowels = {"a","e","i","o","u"};  // 모음 배열

        for(int i = 0; i < my_string.length(); i++) {
            String ch = String.valueOf(my_string.charAt(i));  // 한 글자 추출
            boolean isVowel = false;

            // 모음인지 확인
            for(int j = 0; j < vowels.length; j++) {
                if(ch.equals(vowels[j])) {
                    isVowel = true;
                    break;
                }
            }

            // 모음이 아니면 answer에 추가
            if(!isVowel) {
                answer += ch;
            }
        }

        return answer;
    }
}
