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
