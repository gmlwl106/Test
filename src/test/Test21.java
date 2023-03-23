package test;

/* 이진수 더하기
이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.
 */

public class Test21 {
	public static String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2)+Integer.parseInt(bin2, 2));
    }

	public static void main(String[] args) {
		String bin1 = "10";
		String bin2 = "11";
		System.out.println(solution(bin1, bin2));
	}
	
}