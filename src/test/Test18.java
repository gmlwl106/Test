package test;

/* k�� ����
1���� 13������ ������, 1�� 1, 10, 11, 12, 13 �̷��� �� 6�� �����մϴ�. ���� i, j, k�� �Ű������� �־��� ��, i���� j���� k�� �� �� �����ϴ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.
 */

public class Test18 {
	public static int solution(int i, int j, int k) {
        int answer = 0;
        for(int n=i; n<=j; n++) {
        	String[] numStr = String.valueOf(n).split("");
        	for(int l=0; l<numStr.length; l++) {
        		if(numStr[l].toString().equals(String.valueOf(k))) {
        			answer++;
        		}
        	}
        }
        return answer;
        
//        --�ٸ� ����� �� ���--
//        String str = "";
//        for(int a = i; a <= j; a++) {
//            str += a+"";
//        }
//
//        return str.length() - str.replace(k+"", "").length();
    }

	public static void main(String[] args) {
		System.out.println(solution(10, 50, 5));
	}
	
}