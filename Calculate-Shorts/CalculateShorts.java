/* ==============================================================
 *	[위클리 챌린지] 부족한 금액 계산하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/82612
 * ==============================================================
 */


public class CalculateShorts {
   
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for (int i = 1; i <= count; i++){
            sum += (price*i);
        }

        answer = sum<=money ? 0 : (sum-money);

        return answer;
    }

    /*
    등차수열의 합 공식 이용한 다른 풀이
    public long solution(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
     */

    public static void main(String[] args) {
        long answer = new CalculateShorts().solution(3, 20, 4);
    }

}
