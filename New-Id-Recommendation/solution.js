/* ==============================================================
 *	[2021 KAKAO BLIND RECRUITMENT] 신규 아이디 추천
 *  https://programmers.co.kr/learn/courses/30/lessons/72410
 * ==============================================================
 */

function solution(new_id) {
  let answer = new_id
    .toLowerCase() // 1) 소문자로
    .replace(/[^0-9a-z._-]/g, '') // 2) 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
    .replace(/\.+/g, '.') // 3) 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
    .replace(/^\.|\.$/g, '') // 4) 마침표(.)가 처음이나 끝에 위치한다면 제거
    .replace(/^$/, 'a') // 5) 빈 문자열에 "a" 대입
    .slice(0, 15) // 6) 16자 이상부터 제거
    .replace(/\.$/, ''); // 끝에 있는 마침표 제거
  // 7) 길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙임

  for (let i = 0; i < 3; i++) {
    const len = answer.length;
    if (len <= 2) {
      answer += answer[len - 1];
    }
  }
  return answer;

  /*  
          반복문을 이용하지 않는 풀이법
          const len = answer.length;
          return len > 2 ? answer : answer + answer.charAt(len - 1).repeat(3 - len);
  
          혹은
          if (answer.length === 1) answer = answer[0].repeat(3);
          if (answer.length === 2) answer = answer + answer[1];
      */
}
