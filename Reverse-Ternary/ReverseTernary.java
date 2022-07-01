/* ==============================================================
 *	[월간 코드 챌린지 시즌1] 3진법 뒤집기
 *  https://programmers.co.kr/learn/courses/30/lessons/68935
 * ==============================================================
 */

public class ReverseTernary {

    public int solution(int n) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();

        for(; n>=3; n = n/3){
            int left = n%3;
            sb.append(left);
        }
        sb.append(n);

        String temp[] = sb.reverse().toString().split("");

        int j = 1;

        for(int i = 0; i<temp.length; i++){
            int a = Integer.parseInt(temp[i]);
            answer += a*j;
            j = j*3;
        }

        return answer;
    }

    public static void main(String[] args) {
        int answer = new ReverseTernary().solution(45); //2
        System.out.println(answer);
    }
}
