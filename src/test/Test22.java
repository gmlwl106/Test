package test;

/* 7�� ����
�Ӿ��̴� ����� ���� 7�� ���� �����մϴ�. ���� �迭 array�� �Ű������� �־��� ��, 7�� �� �� �� �ִ��� return �ϵ��� solution �Լ��� �ϼ��غ�����.
 */

public class Test22 {
	public static int solution(int[] array) {
        int answer = 0;
        for(int num : array) {
//        	String[] str = String.valueOf(num).split("");
//        	
//        	for(int i=0; i<str.length; i++) {
//        		if(str[i].equals("7")) {
//        			answer++;
//        		}
//        	}
        	
        	while(num != 0){
                if(num % 10 == 7){
                    answer++;
                }
                num /= 10;
            }
        }
        
        return answer;
    }

	public static void main(String[] args) {
		int[] array = {7, 77, 17};
		System.out.println(solution(array));
	}
	
}