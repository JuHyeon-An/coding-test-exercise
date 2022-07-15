/* ==============================================================
 *	[연습문제] 시저 암호
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12926
 * ==============================================================
 */

public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);
            if(target == ' '){
                answer += " ";
                continue;
            }
            int idx = target+n;
            if((target <= 90 && idx > 90) || (target > 90 && idx > 122)){
                idx = idx-26;
            }

            answer+=(char)idx;
        }

        return answer;
    }

    public static void main(String[] args) {
        String answer = new CaesarCipher().solution("a B z", 4);
        System.out.println(answer);
    }
}
