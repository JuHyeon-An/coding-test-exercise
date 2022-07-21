import java.util.ArrayList;
import java.util.Collections;

/* ==============================================================
 *	[연습문제] 정수 내림차순으로 배치하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12933
 * ==============================================================
 */
public class IntDescending {

    public long solution(long n) {
        long answer = 0;

        String[] arr = (n+"").split("");
        ArrayList<Integer> list = new ArrayList<>();

        for (String a : arr){
            list.add(Integer.parseInt(a));
        }

        Collections.sort(list, Collections.reverseOrder());

        String temp = "";
        for(int a : list){
            temp += a;
        }

        answer = Long.parseLong(temp);

        return answer;
    }


    public static void main(String[] args) {
        long answer = new IntDescending().solution(118372); //873211
        System.out.println(answer);
    }
}
