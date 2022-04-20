package level2;

import java.util.Arrays;
import java.util.Comparator;


//테스트케이스 : 전부 0인경우 제외
public class 가장_큰_수 {

	public static void main(String[] args) {
		
		int[] numbers = { 3, 30, 34, 5, 9 };
		System.out.println(solution(numbers));
	}

	public static String solution(int[] numbers) {

		String[] strArr = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			strArr[i] = Integer.toString(numbers[i]);
		}
		//재정렬
		Arrays.sort(strArr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				o1= o1.repeat(6);
				o2= o2.repeat(6);
				return o2.compareTo(o1);
			}
		});
		
		String res = Arrays.toString(strArr).replace(", ","");
		res = res.substring(1 , res.length()-1);
		
		if(res.replace("0" ,"").length() ==0) {
			return "0";
		}
		
		return res;
	}

}
