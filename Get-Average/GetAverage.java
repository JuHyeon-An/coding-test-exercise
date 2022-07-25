
/* ==============================================================
 *	[연습문제] 평균 구하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12944
 * ==============================================================
 */
public class GetAverage {

    public double solution(int[] arr) {
        double answer = 0;

        for (int num : arr){
            answer += num;
        }

        return answer/(arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        double answer = new GetAverage().solution(arr);
        System.out.println(answer);
    }

}
