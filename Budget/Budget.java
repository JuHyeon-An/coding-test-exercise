import java.util.Arrays;
/* ==============================================================
 *	[Summer/Winter Coding(~2018)] 예산
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12982
 * ==============================================================
 */

public class Budget {

    public int solution(int[] d, int budget) {

        int answer = 0;

        Arrays.sort(d);

        int sum = 0;
        for (int i = 0; i< d.length; i++){
            sum += d[i];
            if(sum > budget){
                break;
            }
            answer ++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int d[] = {2,2,3,3};

        int answer = new Budget().solution(d, 10); //3
        System.out.println(answer);
    }
}
