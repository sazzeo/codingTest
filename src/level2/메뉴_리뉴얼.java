package level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

public class 메뉴_리뉴얼 {

	public static void main(String[] args) {
		String[] orders = { "ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEHI" };
		int[] course = { 2, 3, 4 };
		solution2(orders, course);
	}

	public static String[] solution(String[] orders, int[] course) {
		String[] answer = {};

		// 1. 단하나만 쓰인 애들은 제거한다.
		Set<Character> set = new HashSet<>();
		Map<Character, Integer> alMap = new HashMap<>();

		for (String order : orders) {
			for (int i = 0; i < order.length(); i++) {
				boolean ex = set.add(order.charAt(i));
				if (ex) {
					alMap.put(order.charAt(i), 1);
				} else {
					int newint = alMap.get(order.charAt(i)) + 1;
					alMap.put(order.charAt(i), newint);
				}
			}
		}
		
		System.out.println("여기까지완료");
		for (Entry<Character, Integer> e : alMap.entrySet()) {
			if (e.getValue() == 1) {
				alMap.remove(e.getKey());
			}
		}

		// 조합큐만들기
		for (int i = 0; i < course.length; i++) {

			Queue<Character> q = new LinkedList<>();
			
			for (Entry<Character, Integer> e : alMap.entrySet()) {
				q.add(e.getKey());
			}

		}

		System.out.println(alMap);

		return answer;
	}
	public static String[] solution2(String[] orders, int[] course) {
		String[] answer = {};
		
		StringBuilder sb = new StringBuilder("");
		
		for(String order : orders) {
			sb.append(order);
		}
		
		List<String> alphaList = new ArrayList<>(); 
		
		for(int i = 'A' ; i<='Z' ; i++) {
			String alpha = ((char) i) + "";
			
			int alphaNum = sb.length() - sb.toString().replace( alpha, "" ).length();
			if(alphaNum == 0 || alphaNum ==1) continue;
			alphaList.add(alpha);
			System.out.println(alpha);
		}
		
		System.out.println(sb);
		

		
		
		return answer;
	}
	
	
	private void combination(List<String> list , int start , int n , int r) {
		Map<String , Boolean> map = new LinkedHashMap<String, Boolean>();
		for(String str : list) {
			map.put(str, false);
		}
		
		for(int i=0 ; i<list.size();i++) {
			
			
			
		}
		
		
	}

}
