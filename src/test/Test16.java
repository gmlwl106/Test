package test;

/* �ߺ��� ���� ����
���ڿ� my_string�� �Ű������� �־����ϴ�. my_string���� �ߺ��� ���ڸ� �����ϰ� �ϳ��� ���ڸ� ���� ���ڿ��� return�ϵ��� solution �Լ��� �ϼ����ּ���.
 */

public class Test16 {
	public static String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++) {
        	if(my_string.indexOf(my_string.charAt(i))==i) answer += my_string.charAt(i);
        }
        
        return answer;
    }

	public static void main(String[] args) {
		String my_string = "We are the world";
		System.out.println(solution(my_string));
	}
	
}