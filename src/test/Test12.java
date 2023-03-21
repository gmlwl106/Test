package test;

/* 369����
�Ӿ��̴� ģ����� 369������ �ϰ� �ֽ��ϴ�. 369������ 1���� ���ڸ� �ϳ��� ��� 3, 6, 9�� ���� ���ڴ� ���� ��� 3, 6, 9�� ������ŭ �ڼ��� ġ�� �����Դϴ�.
�Ӿ��̰� ���ؾ��ϴ� ���� order�� �Ű������� �־��� ��, �Ӿ��̰� �ľ��� �ڼ� Ƚ���� return �ϵ��� solution �Լ��� �ϼ��غ�����.
 */

public class Test12 {
	public static int solution(int order) {
//        int answer = 0;
//        String[] num = String.valueOf(order).split("");
//        for(String n : num) {
//        	int number = Integer.parseInt(n);
//        	if(number != 0 && number % 3 == 0) {
//        		answer++;
//        	}
//        }
//        return answer;
		
		int answer = 0;
        while (order >= 1) {
            if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) answer ++;
            order /= 10;
        }
        return answer;
    }

	public static void main(String[] args) {
		int array = 29423;
		System.out.println(solution(array));
	}
	
}