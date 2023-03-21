package test;

/* 숫자 찾기
정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
 */

public class Test14 {
	public static int solution(int num, int k) {
//        String[] arr = String.valueOf(num).split("");
//        for(int i=0; i<arr.length; i++) {
//        	if(Integer.parseInt(arr[i].toString()) == k) {
//        		return i+1;
//        	}
//        }
//        return -1;
		
		//indexOf : 발견한 인덱스 반환. 없으면 -1
		return ("-" + num).indexOf(String.valueOf(k));
    }

	public static void main(String[] args) {
		int n = 29183;
		int k = 1;
		System.out.println(solution(n, k));
	}
	
}