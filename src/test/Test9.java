package test;

import java.util.ArrayList;
import java.util.List;

/* n�� ��� ����
���� n�� ���� �迭 numlist�� �Ű������� �־��� ��, numlist���� n�� ����� �ƴ� ������ ������ �迭�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
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