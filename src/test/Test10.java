package test;

/* �ε��� �ٲٱ�
���ڿ� my_string�� ���� num1, num2�� �Ű������� �־��� ��, my_string���� �ε��� num1�� �ε��� num2�� �ش��ϴ� ���ڸ� �ٲ� ���ڿ��� return �ϵ��� solution �Լ��� �ϼ��غ�����.
 */

public class Test10 {
	public static String solution(String my_string, int num1, int num2) {
        String[] str = my_string.split("");
        
        String temp = str[num1].toString();
        str[num1] = str[num2].toString();
        str[num2] = temp;
        
//        for(String s : str) {
//        	answer += s;
//        }
        return String.join("", str); //String.join : �迭�� ��Ҹ� �̾���� �� ����
    }

	public static void main(String[] args) {
		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;
		System.out.println(solution(my_string, num1, num2));
	}
	
}