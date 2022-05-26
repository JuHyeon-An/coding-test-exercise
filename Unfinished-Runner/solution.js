/* ==============================================================
 *	[해시] 완주하지 못한 선수
 *  https://programmers.co.kr/learn/courses/30/lessons/76501
 * ==============================================================
 */

function solution(participant, completion) {
  let answer = '';

  participant.sort();
  completion.sort();

  for (let i = 0; i < participant.length; i++) {
    if (participant[i] != completion[i]) {
      answer = participant[i];
      break;
    }
  }

  return answer;
}

let participant = ['leo', 'kiki', 'eden', 'ana', 'ana'];
let completion = ['leo', 'kiki', 'eden', 'ana'];

let answer = solution(participant, completion);

console.log(answer);
