package test;

/* �ﰢ���� �ϼ����� (1)
���� �� ���� �ﰢ���� ����� ���ؼ��� ������ ���� ������ �����ؾ� �մϴ�.
���� �� ���� ���̴� �ٸ� �� ���� ������ �պ��� �۾ƾ� �մϴ�.
�ﰢ���� �� ���� ���̰� ��� �迭 sides�� �Ű������� �־����ϴ�. �� ������ �ﰢ���� ���� �� �ִٸ� 1, ���� �� ���ٸ� 2�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
 */

public class Test1 {
	public static int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int minSum = 0;
        
        for(int side: sides) {
        	if(side > max) {
        		minSum += max;
        		max = side;
        	} else {
        		minSum += side;
        	}
        }

        if(max < minSum) answer = 1; else answer = 2;
        
        return answer;
    }

	public static void main(String[] args) {
		int[] sides = {3, 6, 2};
		System.out.println(solution(sides));
	}
	
}