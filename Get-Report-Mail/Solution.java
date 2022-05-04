import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


/* ==============================================================
 *	[2022 KAKAO BLIND RECRUITMENT] 신고 결과 받기
 *  https://programmers.co.kr/learn/courses/30/lessons/92334
 * ==============================================================
 */

class Solution {
	public int[] solution(String[] id_list, String[] report, int k) {

		int idLen = id_list.length;
		int[] answer = new int[idLen];

		Map<String, HashSet<String>> reportMap = new HashMap<String, HashSet<String>>();
		Map<String, Integer> idMap = new HashMap<String, Integer>();
		
		for (int i = 0; i < id_list.length; i++) {
			String userId = id_list[i];
			reportMap.put(userId, new HashSet<String>());
			idMap.put(userId, i);
		}
		
		for (int i = 0; i < report.length; i++) {
			String reporter = report[i].split(" ")[0];
			String reported = report[i].split(" ")[1];
			
			reportMap.get(reported).add(reporter);
		}
		
		for (int i = 0; i < id_list.length; i++) {
			HashSet<String> hs = reportMap.get(id_list[i]);
			for (String userId : hs) {
				if(hs.size()>=k){
					answer[idMap.get(userId)]++;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo",
				"muzi neo", "apeach muzi" };

		Solution s = new Solution();

		int k = 2;
		System.out.println(Arrays.toString(s.solution(id_list, report, k)));

	}

}