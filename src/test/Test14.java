package test;

/* ���� ã��
���� num�� k�� �Ű������� �־��� ��, num�� �̷�� ���� �߿� k�� ������ num�� �� ���ڰ� �ִ� �ڸ� ���� return�ϰ� ������ -1�� return �ϵ��� solution �Լ��� �ϼ��غ�����.
 */

public class Test14 {
	public static int solution(int num, int k) {
//        String[] arr = String.valueOf(num).split("");
//        for(int i=0; i<arr.length; i++) {
//        	if(Integer.parseInt(arr[i].toString()) == k) {
//        		return i+1;
//        	}
//        }
//        return -1;
		
		//indexOf : �߰��� �ε��� ��ȯ. ������ -1
		return ("-" + num).indexOf(String.valueOf(k));
    }

	public static void main(String[] args) {
		int n = 29183;
		int k = 1;
		System.out.println(solution(n, k));
	}
	
}