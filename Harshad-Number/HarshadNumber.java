/* ==============================================================
 *	[연습문제] 하샤드 수
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12947
 * ==============================================================
 */
public class HarshadNumber {
    public boolean solution(int x) {
        int num = 0;
        int temp = x;
        while(temp>0){
            num += temp%10;
            temp = temp/10;
        }

        return x%num == 0;
    }

    public static void main(String[] args) {
        System.out.println(new HarshadNumber().solution(11));

    }
}