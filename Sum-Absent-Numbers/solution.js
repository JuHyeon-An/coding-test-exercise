/* ==============================================================
 *	[월간 코드 챌린지 시즌3] 없는 숫자 더하기
 *  https://programmers.co.kr/learn/courses/30/lessons/86051
 * ==============================================================
 */

function solution(numbers) {
  let answer = 0;
  let sum = 0;
  for (const i of numbers) {
    sum += i;
  }

  return 45 - sum;
}

let answer = solution([1, 3, 5, 6]);
console.log(answer);
