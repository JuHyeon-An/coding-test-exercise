/* ==============================================================
 *	[2020 카카오 인턴십] 키패드 누르기
 *  https://programmers.co.kr/learn/courses/30/lessons/67256
 * ==============================================================
 */

public class KeyPadDirection {

	int currLeft = 10;
	int currRight = 12;
	String hand = "";

		public String solution ( int[] numbers, String hand){
			this.hand = hand;

			String answer = "";

			for (int num : numbers) {
				num = num == 0 ? 11 : num;
				answer += getDirection(num);
			}

			return answer;
		}

		public String getDirection(int num) {
			int x = (num - 1) / 3;
			int y = (num - 1) % 3;
			String result = "";
			if (y == 0) {
				result = "L";
			} else if (y == 2) {
				result = "R";
			} else {
				// center
				int a = Math.abs((currLeft - 1) / 3 - x) + Math.abs((currLeft - 1) % 3 - y);
				int b = Math.abs((currRight - 1) / 3 - x) + Math.abs((currRight - 1) % 3 - y);

				if (a > b) {
					result = "R";
				} else if (a < b) {
					result = "L";
				} else {
					if (hand.equals("left")) {
						result = "L";
					} else {
						result = "R";
					}
				}
			}
			setCurrNum(result, num);
			return result;
		}

		public void setCurrNum(String fin, int num) {
			if (fin.equals("R")) {
				currRight = num;
			} else {
				currLeft = num;
			}
		}

		public static void main (String[]args){
			KeyPadDirection s = new KeyPadDirection();

			int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
			String hand = "left";

			String answer = s.solution(numbers, hand);
			// LRLLRRLLLRR
			System.out.println(answer);


		}
	}

