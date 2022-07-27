/* ==============================================================
 *	[연습문제] x만큼 간격이 있는 n개의 숫자
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12954
 * ==============================================================
 */
public class DistanceX {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i = 0; i<n; i++){
            answer[i] = (long)x*(i+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        long[] answer = new DistanceX().solution(2,5); //2,4,6,8,10
    }
}
