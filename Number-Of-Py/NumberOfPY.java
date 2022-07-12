/* ==============================================================
 *	[연습문제] 문자열 내 p와 y의 개수
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12916
 * ==============================================================
 */

public class NumberOfPY {
    boolean solution(String s) {

        s = s.toLowerCase();

        int cnt = 0;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'y') cnt++;
            if(s.charAt(i) == 'p') cnt--;
        }

        return cnt == 0;
    }

    public static void main(String[] args) {
        boolean answer = new NumberOfPY().solution("pPoooyY");
        System.out.println(answer);
    }
}
