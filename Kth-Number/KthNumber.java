import java.util.Arrays;

/* ==============================================================
 *	[정렬] K번째 수
 *  https://programmers.co.kr/learn/courses/30/lessons/42748
 * ==============================================================
 */

public class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++){
            int first = commands[i][0]-1;
            int second = commands[i][1];
            int third = commands[i][2]-1;

            int[] arr = Arrays.copyOfRange(array, first, second);
            Arrays.sort(arr);

            answer[i] = arr[third];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = new KthNumber().solution(array, commands);
        // 5,6,3

    }
}
