package programmers.level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 행렬_테두리_회전하기 {

	public static void main(String[] args) {
		int rows = 6;
		int columns = 6;
		int[][] queries = { { 2, 2, 5, 4 }, { 3, 3, 6, 6 }, { 5, 1, 6, 3 } };
		solution(rows, columns, queries);

	}

	public static int[] solution(int rows, int columns, int[][] queries) {
		int[][] hang = new int[rows][columns];
		int num = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				hang[i][j] = num++;
			}
		}
		

		int[] xy =  queries[0];
			
			int startX = xy[0]-1 , endX= xy[2]-1 , startY=xy[1]-1 , endY=xy[3]-1;
			
			//현재 좌표값 저장하기
			int thisX = startX;
			int thisY = startY;

			int thisValue = hang[startX][startY];  //덮어쓰기 전 값 담는 함수. 
			for(int i=startY+1 ; i<endY ; i++ ) {
				System.out.println(thisX + "," + thisY);
				thisY++;
				int preValue= hang[thisX][thisY];
				hang[thisX][thisY]=thisValue;
				thisValue = preValue;
				
			}
			
			
		
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(hang[i][j] +" ");
			}
			System.out.println();
		}

		
		return null;
	}

}
