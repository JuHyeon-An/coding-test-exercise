import java.util.Stack;

class CrawlCraneGame{
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 0; i < moves.length; i++) {
            int x = moves[i]-1;
            for (int j = 0; j < board.length; j++) {
                int target = board[j][x];

                if(target != 0){
                    board[j][x] = 0;
                    if(stack.peek() == target){
                        stack.pop();
                        answer ++;
                    } else{
                        stack.push(target);
                    }
                    break;
                }
            }
        }

        return answer*2;
    }

    public static void main(String[] args) {
        CrawlCraneGame a = new CrawlCraneGame();
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        int answer = a.solution(board, moves);
        System.out.println(answer);
    }
}
