import java.util.HashSet;

/* ==============================================================
 *	[찾아라 프로그래밍 마에스터] 폰켓몬
 *  https://programmers.co.kr/learn/courses/30/lessons/1845
 * ==============================================================
 */

public class Phoneketmon {
	public int solution(int[] nums) {
		
		// 1. nums에서 중복값을 제거한다. (HashSet)
		// 2. set의 length와 nums의 length 비교하여 최소값이 answer

		int answer = 0;
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
        
        answer = set.size();
        
        if(set.size() > nums.length/2 ){
        	answer = nums.length/2;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Phoneketmon pk = new Phoneketmon();
		int nums[] = {3,3,3,2,2,4};
		
		int answer = pk.solution(nums);
		System.out.println(answer);
		
		
	}
}
