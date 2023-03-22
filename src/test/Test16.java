package test;

/* 중복된 문자 제거
문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
 */

public class Test16 {
	public static String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++) {
        	if(my_string.indexOf(my_string.charAt(i))==i) answer += my_string.charAt(i);
        }
        
        return answer;
    }

	public static void main(String[] args) {
		String my_string = "We are the world";
		System.out.println(solution(my_string));
	}
	
}