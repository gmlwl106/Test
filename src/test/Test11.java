package test;

/* ���� ū �� ã��
���� �迭 array�� �Ű������� �־��� ��, ���� ū ���� �� ���� �ε����� ���� �迭�� return �ϵ��� solution �Լ��� �ϼ��غ�����.
 */

public class Test11 {
	public static int[] solution(int[] array) {
        int[] answer = new int[2];
        for(int i=0; i<array.length; i++) {
        	if(answer[0] < array[i]) {
        		answer[0] = array[i];
        		answer[1] = i;
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		int[] array = {9, 10, 11, 8};
		System.out.println(solution(array));
	}
	
}