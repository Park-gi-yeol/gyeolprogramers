import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String a1 = "";
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) < 'a') {
                a1 += (char)(a.charAt(i) + 32);
            } else {
                a1 += (char)(a.charAt(i) - 32);
            }
        }
        System.out.println(a1);
    }
}