package test;

/* ���ѼҼ� �Ǻ��ϱ�
�Ҽ��� �Ʒ� ���ڰ� ��ӵ��� �ʰ� ���Ѱ��� �Ҽ��� ���ѼҼ���� �մϴ�. �м��� �Ҽ��� ��ĥ �� ���ѼҼ��� ��Ÿ�� �� �ִ� �м����� �Ǻ��Ϸ��� �մϴ�. ���ѼҼ��� �Ǳ� ���� �м��� ������ ������ �����ϴ�.
���м��� ��Ÿ������ ��, �и��� ���μ��� 2�� 5�� �����ؾ� �մϴ�.
�� ���� a�� b�� �Ű������� �־��� ��, a/b�� ���ѼҼ��̸� 1��, ���ѼҼ���� 2�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
 */

public class Test29 {
	public static int solution(int a, int b) {
		int bottom = b / gcd(a, b);
        while (bottom != 1) {
            if (bottom % 2 == 0) bottom /= 2;
            else if (bottom % 5 == 0) bottom /= 5;
            else return 2;
        }
        return 1;
    }

    static int gcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b == 0) return a;
        return gcd(b, (a % b));
    }

	public static void main(String[] args) {
		int a = 7;
		int b = 20;
		System.out.println(solution(a, b));
	}
	
}