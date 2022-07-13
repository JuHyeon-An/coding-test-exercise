import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* ==============================================================
 *	[연습문제] 문자열 내 마음대로 정렬하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12915
 * ==============================================================
 */

public class SortWords {

    public String[] solution(String[] strings, int n) {


        ArrayList<String> list = new ArrayList<>();

        for(String w : strings){
            list.add(w.charAt(n)+w);
        }

        Collections.sort(list);
        String[] answer = new String[list.size()];

        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] strings = {"fdgs", "qwe", "dsgf", "jhgf", "kjh", "sadf", "nbvc"};

        String[] answer = new SortWords().solution(strings, 2);

        System.out.println(Arrays.toString(answer));

    }

}
