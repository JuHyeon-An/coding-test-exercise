import java.util.*;

public class MockTest {

    public int[] solution(int[] answers) {

        int cnt = answers.length;
        int[] rank = new int[3];

        int[] first = {1,2,3,4,5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < cnt; i++){
            if(answers[i] == first[i%first.length]) rank[0]++;
            if(answers[i] == second[i%second.length]) rank[1]++;
            if(answers[i] == third[i%third.length]) rank[2]++;
        }

        int max = Math.max(rank[0], Math.max(rank[1], rank[2]));

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i<rank.length; i++){
            if(rank[i] == max) list.add(i+1);
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }


        return answer;
    }


    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};
        MockTest mt = new MockTest();
        int[] answer = mt.solution(answers);

        System.out.println(Arrays.toString(answer));
    }
}
