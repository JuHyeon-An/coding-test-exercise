/* ==============================================================
 *	[연습문제] 수박수박수박수박수박수?
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12901
 * ==============================================================
 */

public class Watermelon {
    public String solution(int n) {
        String answer = "";

        for(int i = 0; i<n; i++){
            answer += i%2 == 0 ? "수" : "박";
        }

        return answer;
        /*
        다른 풀이
        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
        */

    }

    public static void main(String[] args) {
        String answer = new Watermelon().solution(5); //수박수
        System.out.println(answer);
    }
    
}
