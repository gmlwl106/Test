package test;

/* ������ �Ǻ��ϱ�
� �ڿ����� �������� �� ������ ������ ��������� �մϴ�. ���� n�� �Ű������� �־��� ��, n�� ��������� 1�� �ƴ϶�� 2�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
 */

public class Test05 {
	public static int solution(int n) {
		//Math.sqrt : ������ �Ǻ� �Լ�
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }

	public static void main(String[] args) {
		int n = 144;
		System.out.println(solution(n));
	}
	
}