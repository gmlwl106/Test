package test;

/* 자릿수 더하기
정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
 */

public class Test03 {
	public static int solution(int n) {
        int answer = 0;
        String[] number = String.valueOf(n).split("");
        for(String num : number) {
        	answer += Integer.parseInt(num);
        }
        return answer;
    }

	public static void main(String[] args) {
		int n = 1234;
		System.out.println(solution(n));
	}
	
}