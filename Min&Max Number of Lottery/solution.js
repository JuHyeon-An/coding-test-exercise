/* ==============================================================
 *	[2021 Dev-Matching]로또의 최고 순위와 최저 순위
 * ==============================================================
 */

function solution(lottos, win_nums) {
  let answer = [];
  const winCnt = win_nums.filter((num) => lottos.includes(num)).length;
  const zeroCnt = lottos.filter((num) => num == 0).length;
  const max = winCnt + zeroCnt;

  answer[0] = max == 0 ? 6 : 7 - max;
  answer[1] = winCnt <= 1 ? 6 : 7 - winCnt;

  return answer;
}

// 테스트
const lottos = [0, 0, 0, 0, 0, 0];
const win_nums = [38, 19, 20, 40, 15, 25];

const a = solution(lottos, win_nums);
console.log(a);
