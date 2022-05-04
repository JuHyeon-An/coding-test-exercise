/* ==============================================================
 *	[2021 카카오 채용연계형 인턴십] 숫자 문자열과 영단어
 *  https://programmers.co.kr/learn/courses/30/lessons/81301
 * ==============================================================
 */

function solution(s) {
  var answer = 0;
  let engNum = [
    'zero',
    'one',
    'two',
    'three',
    'four',
    'five',
    'six',
    'seven',
    'eight',
    'nine',
    'ten',
  ];

  for (let i = 0; i < engNum.length; i++) {
    const e = engNum[i];
    if (s.includes(e)) {
      s = s.split(e).join(i);
    }
  }
  answer = s;
  return answer;
}
