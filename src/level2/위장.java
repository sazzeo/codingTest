package level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class 위장 {

	public static void main(String[] args) {
		
		String[][] clothes = 
		{{"yellowhat", "headgear"}, {"green_turban", "headgear"},{"red", "headgear"},{"bluesunglasses", "eyewear"}};
		
		solution(clothes);

		
		
	}
	

	public static int solution(String[][] clothes) {
		
		
		
		HashMap<String, ArrayList<String>> hash = new HashMap<>();
		
		for(int i = 0; i < clothes.length;i++) {
			
			if(hash.get(clothes[i][1])==null) {
				hash.put(clothes[i][1], new ArrayList<>());
	
			}
			
			hash.get(clothes[i][1]).add(clothes[i][0]);
			
			
		}
		

		Iterator<String> ir = hash.keySet().iterator();
		int res=1;
		while(ir.hasNext()) {
			
			String key = ir.next(); 
			res*=(hash.get(key).size()+1);
		}
			


		
		
		
		return res-1;
	}
	
	
	
	/*
	 * public static int solution(String[][] clothes) {
	 * 
	 * 
	 * 
	 * HashMap<String, ArrayList<String>> hash = new HashMap<>();
	 * 
	 * for(int i = 0; i < clothes.length;i++) {
	 * 
	 * if(hash.get(clothes[i][1])==null) { hash.put(clothes[i][1], new
	 * ArrayList<>());
	 * 
	 * }
	 * 
	 * hash.get(clothes[i][1]).add(clothes[i][0]);
	 * 
	 * 
	 * }
	 * 
	 * int mul=1; int sum=0; Iterator<String> ir = hash.keySet().iterator();
	 * 
	 * while(ir.hasNext()) {
	 * 
	 * String key = ir.next(); mul*=hash.get(key).size(); sum+=hash.get(key).size();
	 * }
	 * 
	 * 
	 * System.out.println("곱:" +mul + "합: " + sum); System.out.println("해시 사이즈: " +
	 * hash.size()); int res = sum + ((int)Math.pow(2,
	 * hash.size())-1-hash.size())*mul;
	 * 
	 * 
	 * System.out.println(res);
	 * 
	 * 
	 * return res; }
	 */
}
