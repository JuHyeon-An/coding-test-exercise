/* ==============================================================
 *	[연습문제] 문자열 다루기 기본
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12918
 * ==============================================================
 */

public class NumberOrString {

    public boolean solution(String s) {
        int len = s.length();
        return s.matches("^[0-9]*$") && (len == 4 || len == 6);
    }

    public static void main(String[] args) {
        boolean answer = new NumberOrString().solution("1234");
        System.out.println(answer);
    }
}
