package test;

/* ���� ����
� ������ 1�ð��� �ι踸ŭ �����Ѵٰ� �մϴ�. ó�� ������ ������ n�� ����� �ð� t�� �Ű������� �־��� �� t�ð� �� ������ ���� return�ϵ��� solution �Լ��� �ϼ����ּ���.
 */

public class Test8 {
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