package programmers.level2;

public class 문자열_압축 {

	public static void main(String[] args) {
		
		String s = "aabbaccc";
		solution2(s);

	}

	public static int solution(String s) {
		
		int min= s.length();

		for (int i = 2; i <= s.length() / 2; i++) {

			int answer = 0;
			int reNum = 0; // 반복된 횟수
			String preStr = ""; // 그 전 String
			int stNum=0;
			int endNum =stNum+i;
			while(endNum <= s.length()+i) {
				System.out.println(">>>>>>>>>>>>>>>>>>>>");
				System.out.println(i + "로 자름");
				String thisStr = s.substring(stNum, endNum);
				
				if(stNum==0) {
					preStr = thisStr;
					stNum=endNum;
					endNum+=i;
					continue;
				}
				
				if(thisStr.equals(preStr)) {
					reNum++;
				} else {
					answer += i;
					if (reNum != 0) {
						answer++;
					}
				}
				System.out.println("pre: " + preStr +"  this: " + thisStr );
				preStr = thisStr;
				stNum=endNum;
				endNum+=i;
				
				System.out.println(answer);
				if(endNum>= s.length()) {
					answer+= s.length()-(endNum-i);
					break;
				}
				
			}
			
			System.out.println("answer : " + answer);
			min = Math.min(answer, min);

		}
		
		System.out.println(min);
		
		return min;
	}
	
	
	public static int solution2(String s) {
		
		int min= s.length();

		for (int i = 1; i <= s.length() / 2; i++) {

			int answer = 0;
			int reNum = 0; // 반복된 횟수
			String preStr = s.substring(0, i); // 그 전 String
			int stNum=i;
			int endNum =stNum+i;
			while(endNum <= s.length()+i) {
				String thisStr = "";
				
				if(endNum>=s.length()) {
					thisStr = s.substring(stNum);
				}else {
					thisStr = s.substring(stNum, endNum) ;
				}
				if(thisStr.equals(preStr)) {
					reNum++;
				}else {
					if(reNum!=0) {
						answer+=(i+1);
						reNum=0;
					}else {
						answer+=thisStr.length();
					}
				}
				
				preStr=thisStr;
				stNum=endNum;
				endNum+=i;
				
			}
			System.out.println("=======================");
			System.out.println(i + "로 나눔");
			System.out.println(answer);
			System.out.println("=======================");
			min = Math.min(answer, min);

		}
		
		
		return min;
	}

}
