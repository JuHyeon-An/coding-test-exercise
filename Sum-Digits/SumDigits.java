/* ==============================================================
 *	[연습문제] 자릿수 더하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12931
 * ==============================================================
 */
public class SumDigits {

    public int solution(int n) {
        int answer = 0;
        String[] str = (n+"").split("");

        for (String s : str){
            answer += Integer.parseInt(s);
        }

        return answer;
    }

    public static void main(String[] args) {
        int answer = new SumDigits().solution(123);
        System.out.println(answer);
    }
}
