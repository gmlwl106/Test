package test;

/* ������ ���ϱ�
�������� �ǹ��ϴ� �� ���� ���ڿ� bin1�� bin2�� �Ű������� �־��� ��, �� �������� ���� return�ϵ��� solution �Լ��� �ϼ����ּ���.
 */

public class Test21 {
	public static String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2)+Integer.parseInt(bin2, 2));
    }

	public static void main(String[] args) {
		String bin1 = "10";
		String bin2 = "11";
		System.out.println(solution(bin1, bin2));
	}
	
}