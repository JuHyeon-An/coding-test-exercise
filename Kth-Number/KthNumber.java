import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        String[] participant = {"leo", "kiki", "eden"};
        List<Integer> list = Arrays.stream(array).boxed().toList();

        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < commands.length; i++){
            int first = commands[i][0]-1;
            int second = commands[i][1]-1;
            int third = commands[i][2] + first;

            System.out.println(array[third]);


                System.out.println("end");


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