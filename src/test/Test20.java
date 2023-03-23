package test;

import java.util.Arrays;

/* 한 번만 등장한 문자
문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
 */

public class Test20 {
	public static String solution(String s) {
        String str = "";
        for(int i=0; i<s.length(); i++) {
	        if(s.length() - s.replace(String.valueOf(s.charAt(i)), "").length() == 1) {
	        	str += s.charAt(i);
	        }
        }
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

	public static void main(String[] args) {
		String s = "hello";
		System.out.println(solution(s));
	}
	
}