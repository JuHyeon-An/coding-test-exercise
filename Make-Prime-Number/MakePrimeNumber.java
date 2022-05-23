/* ==============================================================
 *	[Summer/Winter Coding(~2018)] 소수 만들기
 *  https://programmers.co.kr/learn/courses/30/lessons/12977
 * ==============================================================
 */

public class MakePrimeNumber {
	
	public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int k = j+1; k < nums.length; k++) {
					int target = nums[i] + nums[j] + nums[k];
					if(isPrimeNum(target)){
						answer ++;
					}
				}
			}
		}
        
        return answer;
    }
	
	public boolean isPrimeNum(int num){
		boolean result = false;
		// 소수 : 1과 자기 자신만 약수로 가지는 수 = 1과 자기 자신 제외하고는 나머지가 0이 아님
		
		for (int i = 2; i < num; i++) {
			if(num%i == 0){
				result = false;
				break;
			}else{
				result = true;
			}
		}
		
		
		return result;
	}
	
	public static void main(String[] args) {
		MakePrimeNumber pn = new MakePrimeNumber();
		
		int[] nums = {1,2,7,6,4}; 
		// 1234 : 1 (7)
		// 12764 : 4
		
		int answer = pn.solution(nums);
		System.out.println(answer);
	}
}
