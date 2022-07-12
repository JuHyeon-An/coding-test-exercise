/* ==============================================================
 *	[연습문제] 문자열 내 p와 y의 개수
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12916
 * ==============================================================
 */

public class NumberOfPY {
    boolean solution(String s) {
        boolean answer = true;

        String[] temp = s.toLowerCase().split("");

        int y = 0;
        int p = 0;
        for(String c : temp){
            if(c.equals("y")) y++;
            if(c.equals("p")) p++;
        }

        answer = y==p ? true: false;

        return answer;
    }

    public static void main(String[] args) {
        boolean answer = new NumberOfPY().solution("pPoooyY");
        System.out.println(answer);
    }
}
