import java.util.ArrayList;
import java.util.Arrays;

/* ==============================================================
 *	[연습문제] 나누어 떨어지는 숫자 배열
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12910
 * ==============================================================
 */

public class DivisorArray {

    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : arr){
            if(i%divisor == 0){
                list.add(i);
            }
        }
        if(list.size() == 0) list.add(-1);

        int[] answer = list.stream().sorted().mapToInt(i->i).toArray();

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int[] answer = new DivisorArray().solution(arr, 11);
        System.out.println(Arrays.toString(answer));
    }
}
