/* ==============================================================
 *	[월간 코드 챌린지 시즌2] 음양 더하기
 *  https://programmers.co.kr/learn/courses/30/lessons/76501
 * ==============================================================
 */

public class SumAbsoluteNumber {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = 0; i < absolutes.length; i++) {
        	if(!signs[i]){
				absolutes[i] *= -1;
			}
        	answer += absolutes[i];
		}
        
        return answer;
    }
}