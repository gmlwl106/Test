package test;

import java.util.Arrays;

/* 가까운 수
정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
 */

public class Test19 {
	public static int solution(int[] array, int n) {
		int answer = 0;
        Arrays.sort(array);
        for(int i = 1 ; i < array.length ; i++){
            if(Math.abs(n-array[0]) > Math.abs(n-array[i])){
                array[0] = array[i];
            }
        }
        answer = array[0];
        return answer;
    }

	public static void main(String[] args) {
		int[] array = {10, 3, 4, 12, 13};
		int n = 11;
		System.out.println(solution(array, n));
	}
	
}