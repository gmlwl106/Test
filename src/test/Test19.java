package test;

import java.util.Arrays;

/* ����� ��
���� �迭 array�� ���� n�� �Ű������� �־��� ��, array�� ����ִ� ���� �� n�� ���� ����� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.
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