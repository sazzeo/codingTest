package level1;

import java.util.Arrays;
import java.util.Comparator;

public class 실패율2 {
	public static void main(String[] args) {

		int N = 5;
		int[] stages = { 2, 1, 2, 2, 4, 3, 3 };
		solution(N, stages);

	}

	public static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		Arrays.sort(stages);
		int[][] arr = new int[N][];
		int leng = stages.length; // 남은길이

		for (int i = 0; i < N ; i++) {
			int[] lengArr = new int[3];
			lengArr[0] = i + 1;
			lengArr[1] = 0;
			lengArr[2] = leng;

			for(int j=stages.length-leng ; j < stages.length ; j++) {
				
				if(stages[j]==i+1) {
				lengArr[1]++;
				}else {
					leng-=lengArr[1];
					break;
				}
				
			}

			arr[i] = lengArr;


		}
		
		Arrays.sort(arr , new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				int a = o1[1]*1000/o1[2];
				int b = o2[1]*1000/o2[2];
				return b-a;
			}
			
			
		});
		
		for(int i =0 ; i < N ; i++) {
			answer[i] = arr[i][0];
		}
		
		return answer;
	}

}
