import java.util.HashSet;

/* ==============================================================
 *	[탐욕법(Greedy)] 체육복
 *  https://programmers.co.kr/learn/courses/30/lessons/42862
 * ==============================================================
 */


public class Greedy01 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        HashSet<Integer> lostSet = new HashSet<Integer>();
        HashSet<Integer> reserveSet = new HashSet<Integer>();

        for(int i : lost){
            lostSet.add(i);
        }

        for(int i : reserve){
            if(lostSet.contains(i)){
                lostSet.remove(i);
            }else{
                reserveSet.add(i);
            }
        }

        for(int i : reserveSet){
            if(lostSet.contains(i-1)){
                lostSet.remove(i-1);
            }else if(lostSet.contains(i+1)){
                lostSet.remove(i+1);
            }
        }

        answer = n - lostSet.size();

        return answer;
    }


    public static void main(String[] args) {
        int n = 5; //전체
        int[] lost = {2,4};
        int[] reserve = {3};

        Greedy01 gd = new Greedy01();
        int answer = gd.solution(n, lost, reserve);
    }
}
