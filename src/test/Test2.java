package test;

/* ����
�Ӿ��̴� �ҸӴϲ� ���� ���� ������ ������ �մϴ�. �ҸӴϰ� ���ñ� ���ϵ��� ���� �� �� �� �ڸ� ���� 2cm ũ��� �������� �ϸ�,
������ ���ηθ� ���� ��, ���� ���� message�� ���� ���� �ʿ��� �������� �ּ� ���α��̸� return �ϵ��� solution �Լ��� �ϼ����ּ���.
 */

public class Test2 {
	public static int solution(String message) {
        return message.length() * 2;
    }

	public static void main(String[] args) {
		String message = "happy birthday!";
		System.out.println(solution(message));
	}
	
}