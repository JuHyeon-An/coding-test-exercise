import java.util.ArrayList;
import java.util.Arrays;

/* ==============================================================
 *	[스택/큐] 같은 글자는 싫어
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12906
 * ==============================================================
 */

public class RemoveSameNumber {

    public int[] solution(int []arr) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        int temp = -1;
        for(int i = 0; i<arr.length; i++){
            if(temp != arr[i]){
                list.add(arr[i]);
                temp = arr[i];
            }
        }

        int[] answer = list.stream().mapToInt(i->i).toArray();

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int[] answer = new RemoveSameNumber().solution(arr);

        System.out.println(Arrays.toString(answer));

    }
}

