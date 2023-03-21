package test;

import java.util.ArrayList;
import java.util.List;

/* ��� ���ϱ�
���� n�� �Ű������� �־��� ��, n�� ����� ������������ ���� �迭�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
 */

public class Test13 {
	public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++) {
        	if(n%i == 0) {
        		list.add(i);
        	}
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }

	public static void main(String[] args) {
		int n = 24;
		System.out.println(solution(n));
	}
	
}