package programmers.level1;

public class 이상한_문자_만들기 {
	
	
	public static void main(String[] args) {
	
		String s = "try hello world ";
		System.out.println(solution2(s));
		
	}

	//0이면 대문자 1이면 소문자 => 맨뒤 공백있는 케이스 못만듦
	public static String solution(String s) {
		String[] sArr = s.split(" ");
		StringBuilder sb = new StringBuilder("");
		
		for(int j=0 ; j < sArr.length ; j++) {
			
			for(int i = 0; i < sArr[j].length(); i++) {
				if(i%2==0) {
					sb.append(sArr[j].substring(i, i+1).toUpperCase());
				}else {
					sb.append(sArr[j].substring(i, i+1).toLowerCase());
				}
				
			}

			if(j==sArr.length-1) break;
			sb.append(" ");
			
		}
		
		
		return sb.toString();
	}
	
	//0이면 대문자 1이면 소문자
	public static String solution2(String s) {
		
		int idx = 0;
		StringBuilder sb = new StringBuilder("");
		for(int i= 0 ; i <s.length() ; i++) {
			System.out.println(idx);
			if(s.charAt(i)== ' ') {
				sb.append(" ");
				idx=0;
				continue;
			}
			
			if(idx%2==0) {
				sb.append(s.substring(i, i+1).toUpperCase());
				
			}else {
				sb.append(s.substring(i, i+1).toLowerCase());
				
			}
			
			idx++;
		}
		
		return  sb.toString();
	}

}
