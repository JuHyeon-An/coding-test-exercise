/* ==============================================================
 *	[연습문제] 행렬의 덧셈
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12950
 * ==============================================================
 */
public class MatrixSum {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i = 0; i< answer.length; i++){
            for(int j = 0; j< answer[i].length; j++){
                answer[i][j] = arr1[i][j]+arr2[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};
        int[][] answer = new MatrixSum().solution(arr1, arr2); //{{4,6},{7,9}}
    }
}
