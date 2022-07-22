/* ==============================================================
 *	[연습문제] 최대공약수와 최소공배수
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12940
 * ==============================================================
 */
import java.util.Arrays;

public class CommonFactors {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        for(int i = 1; i<=Math.min(n,m); i++){
            if(n % i == 0 && m % i == 0){
                answer[0] = i;
                answer[1] = n*m / i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answer = new CommonFactors().solution(48,60);
        System.out.println(Arrays.toString(answer));

    }
}
