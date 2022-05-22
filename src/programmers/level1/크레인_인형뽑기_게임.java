package programmers.level1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class 크레인_인형뽑기_게임 {

	public static void main(String[] args) {
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		System.out.println(solution(board, moves));
		
	}

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> basket = new Stack<>();
		List<Queue<Integer>> boardList = new ArrayList<>();

		for (int i = 0; i < board[0].length; i++) {

			Queue<Integer> q = new LinkedList<>();
			for (int j = 0; j < board.length; j++) {
				if (board[j][i] != 0) {
					q.add(board[j][i]);
				}
			}
			boardList.add(q);

		}

		for (int i = 0; i < moves.length; i++) {

			Integer doll = boardList.get(moves[i] - 1).poll();
			if(doll == null) continue;
			
			if(basket.size() != 0 && basket.peek()==doll) {
				basket.pop();
				answer +=2;
			}else {
				basket.push(doll);
			}
			
		}

		return answer;

	}

}
