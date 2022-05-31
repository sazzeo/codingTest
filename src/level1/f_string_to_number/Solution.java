package level1.f_string_to_number;


//숫자 문자열과 영단어
public class Solution {

	public static void main(String[] args) {

		System.out.println(solution("one4seveneight"));


		System.out.println("one4oneseveneight".replace("one", "1"));
		System.out.println("one4seveneightone".contains("one"));
		
	}

	public static int solution(String s) {

		
		
		if(s.contains("zero")) s= s.replace("zero", "0");		
		if(s.contains("one")) s= s.replace("one", "1");	
		if(s.contains("two")) s= s.replace("two", "2");		
		if(s.contains("three")) s= s.replace("three", "3");		
		if(s.contains("four")) s= s.replace("four", "4");		
		if(s.contains("five")) s= s.replace("five", "5");		
		if(s.contains("six")) s= s.replace("six", "6");		
		if(s.contains("seven")) s= s.replace("seven", "7");		
		if(s.contains("eight")) s= s.replace("eight", "8");
		if(s.contains("nine")) s= s.replace("nine", "9");		

	
		return Integer.parseInt(s);
	}
	
	
	public static int solution2(String s) {
		

		
		String[] numberStr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] number = {"0","1","2","3","4","5","6","7","8","9"};
		
		for (int i = 0; i < 10; i++) {
			
			while (s.contains(numberStr[i])) {
				s = s.replace(numberStr[i], number[i]);
			}
		}

		
	
		return Integer.parseInt(s);
	}
}
