package test;

/* 세균 증식
어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
 */

public class Test08 {
	public static int solution(int n, int t) {
        int answer = n;
        for(int i=0; i<t; i++) {
        	answer = answer * 2;
        }
        return answer;
    }

	public static void main(String[] args) {
		int n = 2;
		int t = 10;
		System.out.println(solution(n, t));
	}
	
}