package test;

/* �빮�ڿ� �ҹ���
���ڿ� my_string�� �Ű������� �־��� ��, �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�� ���ڿ��� return�ϵ��� solution �Լ��� �ϼ����ּ���.
 */

public class Test8 {
	public static String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
        	if(Character.isUpperCase(my_string.charAt(i))) {
        		answer += Character.toLowerCase(my_string.charAt(i));
        	} else {
        		answer += Character.toUpperCase(my_string.charAt(i));
        	}
        }
        return answer;
    }

	public static void main(String[] args) {
		String my_string = "cccCCC";
		System.out.println(solution(my_string));
	}
	
}