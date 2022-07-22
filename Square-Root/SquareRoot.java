/* ==============================================================
 *	[연습문제] 정수 제곱근 판별
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12934
 * ==============================================================
 */

public class SquareRoot {

    public long solution(long n) {
        if(Math.pow((int)Math.sqrt(n), 2) == n){
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;

    }

    public static void main(String[] args) {
        long answer = new SquareRoot().solution(121);
        System.out.println(answer);
    }
}
