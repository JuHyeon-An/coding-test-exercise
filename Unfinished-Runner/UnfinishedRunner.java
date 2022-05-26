/* ==============================================================
 *	[해시] 완주하지 못한 선수
 *  https://programmers.co.kr/learn/courses/30/lessons/76501
 * ==============================================================
 */

public class UnfinishedRunner {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> parts = new HashMap<String, Integer>();

        for(String part : participant){
            parts.put(part, parts.getOrDefault(part, 0)+1);
        }

        for(String part : completion){
            parts.put(part, parts.get(part)-1);
        }

        for(String key : parts.keySet()){

            if(parts.get(key) != 0){
                answer = key;
                break;
            }

        }

        return answer;
    }
    
}
