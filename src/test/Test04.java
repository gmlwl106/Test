package test;

/* ���ڿ� �ȿ� ���ڿ�
���ڿ� str1, str2�� �Ű������� �־����ϴ�. str1 �ȿ� str2�� �ִٸ� 1�� ���ٸ� 2�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
 */

public class Test04 {
	public static int solution(String str1, String str2) {
//        int answer = 2;
//        if(str1.contains(str2)) {
//        	answer = 1;
//        }
//        return answer;
		
//		if(str1.contains(str2)) return 1; else return 2;
		
		return (str1.contains(str2)? 1: 2);
    }

	public static void main(String[] args) {
		String str1 = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";
		System.out.println(solution(str1, str2));
	}
	
}