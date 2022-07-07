package Year2016;

/* ==============================================================
 *	[연습문제] 2016년
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12901
 * ==============================================================
 */

public class Year2016 {
    public String solution(int a, int b) {
        String answer = "";

        String[] days = {"SUN","MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int d = 0;
        for(int i = 1; i<a; i++){

            if(i == 2) {
                d+= 29;
            }else{
                if(i<8){
                    if(i%2 == 1){
                        d += 31;
                    }else{
                        d += 30;
                    }
                }else{
                    if(i%2 == 0){
                        d += 31;
                    }else{
                        d += 30;
                    }
                }
            }

        }

        int daysDiff = (b-1)+d;
        int index = (daysDiff+5)%7;

        answer = days[index];

        return answer;
    }

    public static void main(String[] args) {
        String answer = new Year2016().solution(5,24);
        System.out.println(answer);
    }
}
