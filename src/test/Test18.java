package test;

/* k의 개수
1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
 */

public class Test18 {
	public static int solution(int i, int j, int k) {
        int answer = 0;
        for(int n=i; n<=j; n++) {
        	String[] numStr = String.valueOf(n).split("");
        	for(int l=0; l<numStr.length; l++) {
        		if(numStr[l].toString().equals(String.valueOf(k))) {
        			answer++;
        		}
        	}
        }
        return answer;
        
//        --다른 사람이 한 방법--
//        String str = "";
//        for(int a = i; a <= j; a++) {
//            str += a+"";
//        }
//
//        return str.length() - str.replace(k+"", "").length();
    }

	public static void main(String[] args) {
		System.out.println(solution(10, 50, 5));
	}
	
}