package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Temp {

	public static void main(String[] args) {
		
		Map<String, int[]> person = new HashMap<>();
		
		int[] a = new int[1];
		a[0] = 0;
		person.put("지영", a);
		
		
		int[] b = person.get("지영");
		b[0]++;
		
		System.out.println(b);
		System.out.println(person.get("지영")[0]);
		
		

	}

}
