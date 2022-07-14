/* ==============================================================
 *	[연습문제] 문자열을 정수로 바꾸기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12925
 * ==============================================================
 */

public class StringToInt {
    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        int answer = new StringToInt().solution("-1234");
        System.out.println(answer);
    }
}
