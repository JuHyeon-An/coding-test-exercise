public class Solution {
    public String solution(int[] numbers, String hand) {
		
		public String solution(int[] numbers, String hand) {
		
			String answer = "";
			int currLeft = 0;
			int currRight = 0;
			
			for (int i = 0; i < numbers.length; i++) {
				int num = numbers[i];
				int rest = num == 0? 2 : num%3;
				if(rest == 1){
					answer += "L";
					currLeft = num;
				}else if(rest == 0){
					answer += "R";
					currRight = num;
				}else{
					answer += getSteps(currLeft, currRight, num);
				}
				
			}
	
			return answer;
		}
	
		public String getSteps(int left, int right, int current) {
			int leftDr[] = getDirection(left);
			int rightDr[] = getDirection(right);
			int currDr[] = getDirection(current);
			
			int leftResult = Math.abs(leftDr[0] - currDr[0]) + (leftDr[1] - currDr[1]);
			int rightResult = Math.abs(rightDr[0] - currDr[0]) + (rightDr[1] - currDr[1]);
			
			
			String result = leftResult > rightResult ? "R" : "L";
			
			if(leftResult>rightResult){
				result = "R";
			}else if (leftResult<rightResult) {
				result = "L";
			}else{
				result = "0";
			}
			
			return result;
		}
		
		public int[] getDirection(int num){
			
			int x = num/3;
			int rest = num == 0? 2 : num%3;
			
			int y = rest == 1 ? 0 : 2;
			
			int result[] = {x,y};
			return result;
		}
		
		
		public static void main(String[] args) {
			Solution s = new Solution();
	
			int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5, 0 };
			String hand = "right";
	
			String answer = s.solution(numbers, hand);
			// LRLLLRLLRRL
			System.out.println(answer);
			
			
		}
}
