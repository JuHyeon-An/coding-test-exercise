/* ==============================================================
 *	[연습문제] 이상한 문자 만들기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12930
 * ==============================================================
 */

public class WeirdWords {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");

        int index = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i].equals(" ")) {
                index = 0;
                continue;
            }

            if(index%2 ==0){
                // 짝수 대문자
                arr[i] = arr[i].toUpperCase();
            }else{
                arr[i] = arr[i].toLowerCase();
            }

            index++;
        }

        answer = String.join("", arr);

        return answer;
    }

    public static void main(String[] args) {
        String answer = new WeirdWords().solution("try  hello world");
        System.out.println(answer);
    }
}
