public class Solution {
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
				answer += "C";
			}
			
		}

		return answer;
	}

	public int getSteps(String loc1, String loc2) {

		int result = 0;

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
