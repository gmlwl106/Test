package test;

/* ��ȣ �ص�
�� ������ �Ӿ��̴� ���� �� ������ ������ ���� ��ȣ ü�踦 ����Ѵٴ� ���� �˾Ƴ½��ϴ�.
��ȣȭ�� ���ڿ� cipher�� �ְ�޽��ϴ�.
�� ���ڿ����� code�� ��� ��° ���ڸ� ��¥ ��ȣ�Դϴ�.
���ڿ� cipher�� ���� code�� �Ű������� �־��� �� �ص��� ��ȣ ���ڿ��� return�ϵ��� solution �Լ��� �ϼ����ּ���.
 */

public class Test07 {
	public static String solution(String cipher, int code) {
        String answer = "";
        String[] str = cipher.split("");
        for(int i=code-1; i<str.length; i+=code) {
        	answer += str[i].toString();
        }
        
        return answer;
    }

	public static void main(String[] args) {
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		System.out.println(solution(cipher, code));
	}
	
}