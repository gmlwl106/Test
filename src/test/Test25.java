package test;

/* 문자열 계산하기
my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
 */

public class Test25 {
	public static int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split(" ");
//        String sign = "";
//
//        for(int i=0; i<str.length; i++) {
//        	if(str[i].toString().equals("+") || str[i].toString().equals("+")) {
//        		sign = str[i].toString();
//        	} else {
//        		if(sign.equals("")) {
//        			answer = Integer.parseInt(str[i].toString());
//        		} else {
//        			if(sign.equals("+")) {
//        				answer += Integer.parseInt(str[i].toString());
//        			} else {
//        				answer -= Integer.parseInt(str[i].toString());
//        			}
//        		}
//        	}
//        }
        
        int oper = 1;
        
        for(String s : str) {
        	if(s.equals("+") || s.equals("-")) {
        		oper = s.equals("-")? -1 : 1;
        	} else {
        		answer += Integer.parseInt(s) * oper;
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		String my_str = "1 + 2 + 3 + 4";
		System.out.println(solution(my_str));
	}
	
}