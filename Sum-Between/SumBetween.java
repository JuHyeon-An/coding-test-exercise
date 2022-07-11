/* ==============================================================
 *	[연습문제] 두 정수 사이의 합
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12912z
 * ==============================================================
 */

public class SumBetween {

    public long solution(int a, int b) {
        long start = Math.min(a,b);
        long end = Math.max(a,b);

        return ((start+end)*((end-start)+1))/2;
    }

    public static void main(String[] args) {
        long answer = new SumBetween().solution(5,3); //12
        System.out.println(answer);
    }
}
