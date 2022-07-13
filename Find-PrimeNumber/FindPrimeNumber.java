/* ==============================================================
 *	[연습문제] 소수 찾기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12921
 * ==============================================================
 */

public class FindPrimeNumber {
    public int solution(int n) {
        int cnt = 0;

        for (int i = 1; i<=n; i++){
            for(int j = 2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    cnt++;
                    break;
                }
            }
        }

        return n-cnt-1;
    }

    public static void main(String[] args) {
        int answer = new FindPrimeNumber().solution(10);//4
        System.out.println(answer);
    }
}
