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
				result = setFinger("L", num);
			} else if (y == 2) {
				result = setFinger("R", num);
			} else {
				// center
				int a = Math.abs((currLeft - 1) / 3 - x) + Math.abs((currLeft - 1) % 3 - y);
				int b = Math.abs((currRight - 1) / 3 - x) + Math.abs((currRight - 1) % 3 - y);

				if (a > b) {
					result = setFinger("R", num);
				} else if (a < b) {
					result = setFinger("L", num);
				} else if (y == 2) {
				} else {
					if (hand.equals("left")) {
						result = setFinger("L", num);
					} else {
						result = setFinger("R", num);
					}
				}
			}
			return result;
		}

		public String setFinger(String fin, int num) {
			if (fin.equals("R")) {
				currRight = num;
			} else {
				currLeft = num;
			}
			return fin;
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

