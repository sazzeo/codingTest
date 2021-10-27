package level1.a_crane_picking_game;

public class Solution {
	
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
     
        int[] basket = new int[moves.length];
      
        int next = 0;
        int tail = 0;
        
        
        for(int i = 0 ; i < moves.length ; i++) {
        	
        	
        	
        	
        	
        	
        	
        }
        

        
        return answer;
    }
    

	public int pop(int[][] board ,int location) {

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
    
    
    
}
