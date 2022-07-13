import java.util.Arrays;
import java.util.Comparator;

/* ==============================================================
 *	[연습문제] 문자열 내림차순으로 배치하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12917
 * ==============================================================
 */

public class DescendingWords {

    public String solution(String s) {
        String answer = "";

        String[] arr = s.split("");
        Arrays.sort(arr, Comparator.reverseOrder());

        for(String a : arr){
            answer += a;
        }

        return answer;
    }

    public static void main(String[] args) {
        String answer = new DescendingWords().solution("Zbcdefg");
        System.out.println(answer);
    }
}
