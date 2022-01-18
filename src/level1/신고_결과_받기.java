package level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class 신고_결과_받기 {

	public static void main(String[] args) {

		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		
		solution(id_list, report, k);
		
		
		
	}

	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		
		Map<String, HashMap<String, int[]>> singo = new LinkedHashMap<>(); // 누구 신고했는지 담는 곳
		
		Map<String, int[]> person =  new HashMap<>(); //신고 횟수 담는 곳
		
		
		//값 초기화 for문
		for(int i =0 ; i < id_list.length ; i++) {
			singo.put(id_list[i], new HashMap<>());
			int[] a = new int[1];
			a[0] = 0;
			person.put(id_list[i], a);
			answer[i] = 0;
			
		}
		
		for(String rp : report) {
			String[] p = rp.split(" ");
			
			if (singo.get(p[0]).get(p[1]) == null) {
				singo.get(p[0]).put(p[1], person.get(p[1]));
				person.get(p[1])[0]++;
				
			}
			
			
			
		}
		
		
		for(int i= 0 ; i < id_list.length ; i++) {
			
			for(Entry<String, int[]> e: singo.get(id_list[i]).entrySet()) {
				
				if(e.getValue()[0] >= k) {
					answer[i]++;
					
					
				}
				
			}
			
			
			
			
		}
		
		System.out.println(Arrays.toString(answer));
		
		/*
		 * 
		 * 
		 * for(Entry<String, HashMap<String, int[]>> e : singo.entrySet()) {
		 * 
		 * System.out.print(e.getKey() + " : " ); for(Entry<String, int[]>
		 * v:e.getValue().entrySet()) {
		 * 
		 * System.out.print(v.getKey()+"(" + v.getValue()[0] + ")");
		 * 
		 * 
		 * } System.out.println();
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
		
		
		return answer;
	}
}
