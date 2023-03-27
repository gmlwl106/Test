package test;

/* ��� �Ⱦ��
��� ���� �Ӿ��̴� ����� ǥ��Ǿ��ִ� ���ڸ� ���� �ٲٷ��� �մϴ�. ���ڿ� numbers�� �Ű������� �־��� ��, numbers�� ������ �ٲ� return �ϵ��� solution �Լ��� �ϼ��� �ּ���.
 */

public class Test23 {
	public static long solution(String numbers) {
		String string_num = numbers
	            .replace("zero", "0")
	            .replace("one", "1")
	            .replace("two", "2") 
	            .replace("three", "3")
	            .replace("four", "4")
	            .replace("five", "5")
	            .replace("six", "6")
	            .replace("seven", "7")
	            .replace("eight", "8")
	            .replace("nine", "9");

        long answer = Long.parseLong(string_num);
        return answer;
    }

	public static void main(String[] args) {
		String numbers = "onetwothreefourfivesixseveneightnine";
		System.out.println(solution(numbers));
	}
	
}