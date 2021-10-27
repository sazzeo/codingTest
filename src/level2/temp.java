package level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class temp {
	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		
		System.out.println("원래 List:" + list.toString());

		List<String> copy = new ArrayList<>(list);
		copy.remove(0);
		System.out.println(copy.toString());
		System.out.println(list.toString());
	}

}
