package test;

/* ���� �ڸ���
�Ӿ��̴� ū ���̸� 1 x 1 ũ���� �ڸ����� �մϴ�. ���� ��� 2 x 2 ũ���� ���̸� 1 x 1 ũ��� �ڸ����� �ּ� ������ �� ���� �ʿ��մϴ�.
 */

public class Test27 {
	public static int solution(int M, int N) {
        return (M*N)-1;
        //(����-1)*(����-1)
    }

	public static void main(String[] args) {
		int M = 2;
		int N = 5;
		System.out.println(solution(M,N));
	}
	
}