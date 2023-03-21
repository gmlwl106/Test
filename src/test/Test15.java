package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 문자열 정렬하기(2)
영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
 */

public class Test15 {
	public static String solution(String my_string) {
        String answer = "";
        List<String> arr = Arrays.asList(my_string.toLowerCase().split(""));
        Collections.sort(arr);
        
        for(String str : arr) {
        	answer += str;
        }
        return answer;
    }

	public static void main(String[] args) {
		String my_string = "Bcad";
		System.out.println(solution(my_string));
	}
	
}