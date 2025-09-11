import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(a);
        arr2.add(b);
        arr2.add(c);
        arr2.add(d);
        Collections.sort(arr2);

        // 1. 네 개가 같은 경우
        if (arr2.get(0).equals(arr2.get(3))) {
            answer = arr2.get(0) * 1111;

        // 2. 세 개가 같은 경우
        } else if (arr2.get(0).equals(arr2.get(2)) || arr2.get(1).equals(arr2.get(3))) {
            int p, q;
            if (arr2.get(0).equals(arr2.get(2))) { // 앞 3개가 같은 경우
                p = arr2.get(0);
                q = arr2.get(3);
            } else { // 뒤 3개가 같은 경우
                p = arr2.get(3);
                q = arr2.get(0);
            }
            answer = (10 * p + q) * (10 * p + q);

        // 3. 두 개씩 같은 경우
        } else if (arr2.get(0).equals(arr2.get(1)) && arr2.get(2).equals(arr2.get(3))) {
            int p = arr2.get(0);
            int q = arr2.get(2);
            answer = (p + q) * Math.abs(p - q);

        // 4. 두 개만 같은 경우
        } else if (arr2.get(0).equals(arr2.get(1))) {
            answer = arr2.get(2) * arr2.get(3);
        } else if (arr2.get(1).equals(arr2.get(2))) {
            answer = arr2.get(0) * arr2.get(3);
        } else if (arr2.get(2).equals(arr2.get(3))) {
            answer = arr2.get(0) * arr2.get(1);

        // 5. 네 개 다 다른 경우
        } else {
            answer = arr2.get(0);
        }

        return answer;
    }
}
