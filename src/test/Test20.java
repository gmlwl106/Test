package test;

import java.util.Arrays;

/* �� ���� ������ ����
���ڿ� s�� �Ű������� �־����ϴ�. s���� �� ���� �����ϴ� ���ڸ� ���� ������ ������ ���ڿ��� return �ϵ��� solution �Լ��� �ϼ��غ�����.
�� ���� �����ϴ� ���ڰ� ���� ��� �� ���ڿ��� return �մϴ�.
 */

public class Test20 {
	public static String solution(String s) {
        String str = "";
        for(int i=0; i<s.length(); i++) {
	        if(s.length() - s.replace(String.valueOf(s.charAt(i)), "").length() == 1) {
	        	str += s.charAt(i);
	        }
        }
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

	public static void main(String[] args) {
		String s = "hello";
		System.out.println(solution(s));
	}
	
}