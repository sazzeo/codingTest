package programmers.level1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class 실패율2 {
	public static void main(String[] args) {

		
		int N = 10;
		int[] stages = { 2, 1, 2, 2, 4,6 , 6};
	
		solution2(N, stages);

	}

	
	
	

	public static int[] solution2(int N, int[] stages) {
	
		Map<Integer, Double> map = new HashMap<>();
		Arrays.sort(stages);
		double 분자=0;
		double 분모=stages.length;
		int idx = 0;

		for(int i=1 ; i <= N ; i++) {
			
			while(i == stages[idx]) {
				분자++;
				idx++;
				if(idx >= stages.length) break;
			}
			
			map.put(i , (double) (분자/분모));
			분모-=분자;
			분자=0;
			
			if(분모==0) break;

		}
		
		if(map.size() < N) {
			for(int i = map.size()+1; i<=N; i++) {
				map.put(i , 0.0);
			}
		}
	
		int[] answer = new int[N];
		
		List<Map.Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list , new Comparator<Entry<Integer, Double>>() {

			@Override
			public int compare(Entry<Integer, Double> o1, Entry<Integer, Double> o2) {
				return Double.compare(o2.getValue(), o1.getValue());
			}
	
		});
		
		for(int i = 0 ; i < N ; i++) {
			answer[i] = list.get(i).getKey();
			
		}
		return answer;
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
