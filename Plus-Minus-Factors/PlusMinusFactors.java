/* ==============================================================
 *	[월간 코드 챌린지 시즌2] 약수의 개수와 덧셈
 *  https://programmers.co.kr/learn/courses/30/lessons/77884
 * ==============================================================
 */

public class PlusMinusFactors {

    // 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
    public int solution(int left, int right) {
        int answer = 0;

        for(; left <= right; left++){
            int cnt = 0;
            for(int j = 1; j<=left; j++){
                if(left%j == 0){
                    //약수
                    cnt++;
                }
            }
            if(cnt%2 == 0){
                answer+=left;
            }else{
                answer-=left;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int answer = new PlusMinusFactors().solution(24, 27); //43
        System.out.println(answer);
    }
}