/* ==============================================================
 *	[연습문제] 가운데 글자 가져오기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12903
 * ==============================================================
 */

public class MiddleCharacter {
    public String solution(String s) {
        String answer = "";

        int len = s.length();
        int idx = len/2;

        if(len%2==0){
            answer = s.substring(idx-1, idx+1);
        } else {
            answer = s.substring(idx, idx + 1);
        }

        /*
         * 다른 풀이
         * word.substring((word.length()-1) / 2, word.length()/2 + 1);
         */

        return answer;
    }

    public static void main(String[] args) {
        String answer = new MiddleCharacter().solution("ab");
        System.out.println(answer);
    }
}
