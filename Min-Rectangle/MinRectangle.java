package Min-Rectangle;

/* ==============================================================
 *	[위클리챌린지] 최소 직사각형
 *  https://school.programmers.co.kr/learn/courses/30/lessons/86491
 * ==============================================================
 */

public class MinRectangle {
    public int solution(int[][] sizes) {
        int answer = 0;

        for(int[] size : sizes){
            for(int i = 0; i<size.length-1; i++){
                if(size[i] < size[i+1]){
                    int temp = size[i];
                    size[i] = size[i+1];
                    size[i+1] = temp;
                }
            }
        }

        int max1 = sizes[0][0];
        int max2 = sizes[0][1];

        for(int j = 0; j<sizes.length; j++){
            System.out.println(sizes[j][0]);
            if(sizes[j][0] > max1){
                max1 = sizes[j][0];
            }

            if(sizes[j][1] > max2){
                max2 = sizes[j][1];
            }
        }

        answer = max1*max2;

        return answer;
    }

    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}}; //4000
        int answer = new MinRectangle().solution(sizes);
        System.out.println(answer);
    }
}
