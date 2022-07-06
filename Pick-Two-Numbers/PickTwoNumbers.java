import java.util.Arrays;
import java.util.HashSet;

/* ==============================================================
 *	[Summer/Winter Coding(~2018)] 예산
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12982
 * ==============================================================
 */

public class PickTwoNumbers {

    public int[] solution(int[] numbers) {

        HashSet<Integer> set = new HashSet();

        for (int i = 0; i<numbers.length; i++){
            for (int j = i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        int[] answer = new PickTwoNumbers().solution(numbers);

        System.out.println(Arrays.toString(answer));
    }
}
