package test;

/* 인덱스 바꾸기
문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
 */

public class Test10 {
	public static String solution(String my_string, int num1, int num2) {
        String[] str = my_string.split("");
        
        String temp = str[num1].toString();
        str[num1] = str[num2].toString();
        str[num2] = temp;
        
//        for(String s : str) {
//        	answer += s;
//        }
        return String.join("", str); //String.join : 배열의 요소를 이어붙일 수 있음
    }

	public static void main(String[] args) {
		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;
		System.out.println(solution(my_string, num1, num2));
	}
	
}