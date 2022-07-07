/* ==============================================================
 *	[월간 코드 챌린지 시즌3] 나머지가 1이 되는 수 찾기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/87389
 * ==============================================================
 */

public class FindRemainder {
    
    public int solution(int n) {
        int answer = 0;

        for(int i = 2; i<=n; i++){
            if(n%i == 1){
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int answer = new FindRemainder().solution(10); //3
        System.out.println(answer);
    }
}
