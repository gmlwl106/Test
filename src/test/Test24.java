package test;

/* �߶� �迭�� �����ϱ�
���ڿ� my_str�� n�� �Ű������� �־��� ��, my_str�� ���� n�� �߶� ������ �迭�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
 */

public class Test24 {
	public static String[] solution(String my_str, int n) {
		int length = (int) Math.ceil((double)my_str.length()/n); //double������ ��ȯ �� �ø��� �ؾ���
        String[] answer = new String[length];
        int cnt = 0;
        for(int i=0; i<answer.length; i++) {
        	if(my_str.length() >= cnt+n) {
        		answer[i] = my_str.substring(cnt, cnt+n);
        		cnt += n;
        	} else {
        		answer[i] = my_str.substring(cnt);
        	}
        }
        
        
        return answer;
    }

	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		System.out.println(solution(my_str, n));
	}
	
}