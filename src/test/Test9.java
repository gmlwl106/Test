package test;

import java.util.ArrayList;
import java.util.List;

/* n의 배수 고르기
정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
 */

public class Test9 {
	public static int[] solution(int n, int[] numlist) {
        List<Integer> numArr = new ArrayList<>();
        
        for(int num : numlist) {
        	if(num % n == 0) {
        		numArr.add(num);
        	}
        }
        
        int[] answer = new int[numArr.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = numArr.get(i);
        }
        
        return answer;
    }

	public static void main(String[] args) {
		int n = 3;
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		System.out.println(solution(n, numlist));
	}
	
}