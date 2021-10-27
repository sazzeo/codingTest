package level1.a_crane_picking_game;

public class Run {
	public static void main(String[] args) {
		


		int[][] borad = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = {1,5,3,5,1,2,1,4};
		
		
		temp1 t = new temp1(borad , moves);
		
		t.printBoard();
		t.putBasket();
		t.printBoard();
		t.printBasket();
		
		System.out.println("결과: " + t.getResult()+"점");
		
		
	}
}
