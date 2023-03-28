package test;

/* ������ ������ ����� ��
�Ӿ��̴� ������ ģ���鿡�� �������ַ��� �մϴ�. ������ ��� �ٸ��� ������ϴ�. 
�Ӿ��̰� ���� �ִ� ������ ���� balls�� ģ���鿡�� ������ �� ���� ���� share�� �Ű������� �־��� ��, 
balls���� ���� �� share���� ������ ���� ������ ��� ����� ���� return �ϴ� solution �Լ��� �ϼ����ּ���.
 */

public class Test26 {
	public static int solution(int balls, int share) {
		long answer = 0;

        int d = (balls - share) > share ? share : balls - share;
        if (d == 0) return 1;

        return solution(balls - 1, d - 1) * balls / d;
    }

	public static void main(String[] args) {
		int balls = 3;
		int share = 2;
		System.out.println(solution(balls, share));
	}
	
}