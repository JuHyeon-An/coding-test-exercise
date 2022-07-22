/* ==============================================================
 *	[연습문제] 제일 작은 수 제거하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12935
 * ==============================================================
 */
public class RemoveMin {

    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[arr.length-1];

        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min ){
                min = arr[i];
            }
        }

        int idx = 0;
        for(int a : arr){
            if(min != a){
                answer[idx] = a;
                idx ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,7,43,1,3,0};
        int[] answer = new RemoveMin().solution(arr);
    }
}
