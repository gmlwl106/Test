package test;

/* �ڸ��� ���ϱ�
���� n�� �Ű������� �־��� �� n�� �� �ڸ� ������ ���� return�ϵ��� solution �Լ��� �ϼ����ּ���
 */

public class Test03 {
	public static int solution(int n) {
        int answer = 0;
        String[] number = String.valueOf(n).split("");
        for(String num : number) {
        	answer += Integer.parseInt(num);
        }
        return answer;
    }

	public static void main(String[] args) {
		int n = 1234;
		System.out.println(solution(n));
	}
	
}