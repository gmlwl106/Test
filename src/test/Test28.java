package test;

/* ġŲ ����
���α׷��ӽ� ġŲ�� ġŲ�� ���Ѹ����� �� ������ ������ �� �� �߱��մϴ�. ������ �� �� ������ ġŲ�� �� ���� ���񽺷� ���� �� �ְ�, ���� ġŲ���� ������ �߱޵˴ϴ�.
���Ѹ��� ġŲ�� �� chicken�� �Ű������� �־��� �� ���� �� �ִ� �ִ� ���� ġŲ�� ���� return�ϵ��� solution �Լ��� �ϼ����ּ���.
 */

public class Test28 {
	public static int solution(int chicken) {
        int answer = 0;
        
        while(chicken >= 10) {
        	int newChick = chicken / 10;
        	int restChick = chicken % 10;
        	chicken = newChick + restChick;
        	answer += newChick;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		int chicken = 1081;
		System.out.println(solution(chicken));
	}
	
}