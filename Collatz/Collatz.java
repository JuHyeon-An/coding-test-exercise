/* ==============================================================
 *	[연습문제] 콜라츠 추측
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12943
 * ==============================================================
 */
public class Collatz {
    public int solution(int num) {
        int cnt = 0;
        while(cnt<500 && num >1){
            if(num%2 ==0){
                num /= 2;
            }else{
                num = (num*3)+1;
            }
            cnt ++;
        }

        return num == 1 ? cnt : -1;
    }

    public static void main(String[] args) {
        int answer = new Collatz().solution(626331);
        System.out.println(answer);
    }

}
