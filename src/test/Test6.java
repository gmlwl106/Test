package test;

/* 배열의 유사도
두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
 */

public class Test6 {
	public static int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(String str1 : s1) {
        	for(String str2 : s2) {
        		if(str1.equals(str2)) {
        			answer++;
        		}
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		System.out.println(solution(s1, s2));
	}
	
}