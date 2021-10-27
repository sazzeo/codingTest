package level1.a_crane_picking_game;

import java.util.ArrayList;
import java.util.List;

public class temp1 {
	
	int[][] board;
	int[] moves;
	List<Integer> basket;
	int result;
	
	


	public int getResult() {
		return result;
	}




	public temp1(int[][] board, int[] moves) {
		super();
		this.board = board;
		this.moves = moves;
		this.basket = new ArrayList<>();
		this.result = 0;
	}
	

	

	public int pop(int location) {

		int idx = 0;
		for (int i = 0; i < board.length; i++) {
			
			if(board[i][location-1]!=0) {
				break;
			}
			idx++;
			if(idx==board.length) 
			 {idx -=1;}

		}
		
		int res = board[idx][location-1];
		board[idx][location-1] = 0;
		return res;
		
	}
	
	
	public void printBoard() {
		
		for(int i = 0 ; i<board.length ; i++) {
			
			for(int j=0 ; j <board[i].length; j++) {
				System.out.print(board[i][j] + " ");
				
			}
			System.out.println();
			
		}
		
		System.out.println("==============");
		
	}
	
	
	
	//배스킷에 집어 넣기
	public void putBasket() {
		
		int tail=0; //마지막 원소 담아두기용 변수
		int next=0;

		
		for(int i = 0, idx=0 ; i <moves.length ; i++, idx++ ) {
			
			
			next = pop(moves[i]);

			
			if(next==0) {
				idx--;
				continue;
			}
		
			if(tail==next) {
				basket.remove(--idx);
				tail = basket.get(--idx);
				result+=2;
				
				
			}else {
			basket.add(next);
			tail = next;
		
			}
			
			
			
			
		}

	}
	
	
	
	
	public void printBasket() {
		
		System.out.println(basket);
		
		
	}
	
	
	


}
