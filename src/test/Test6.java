package test;

/* �迭�� ���絵
�� �迭�� �󸶳� �������� Ȯ���غ����� �մϴ�. ���ڿ� �迭 s1�� s2�� �־��� �� ���� ������ ������ return�ϵ��� solution �Լ��� �ϼ����ּ���.
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