/* ==============================================================
 *	[연습문제] 핸드폰번호 가리기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12948
 * ==============================================================
 */
public class MaskingPhone {
    public String solution(String phone_number) {
        String[] arr = phone_number.split("");

        for(int i = 0; i<arr.length-4; i++){
            arr[i] = "*";
        }

        return String.join("", arr);
    }

    public static void main(String[] args) {
        System.out.println(new MaskingPhone().solution("01033334444"));
    }
}
