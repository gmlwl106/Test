package test;

/* Ư���� ����
���� n�� �������� n�� ����� ������ �����Ϸ��� �մϴ�. �̶� n���κ����� �Ÿ��� ���ٸ� �� ū ���� �տ� ������ ��ġ�մϴ�.
������ ��� �迭 numlist�� ���� n�� �־��� �� numlist�� ���Ҹ� n���κ��� ����� ������� ������ �迭�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
 */

public class Test30 {
	public static int[] solution(int[] numlist, int n) {
		int size = numlist.length;
        for(int i=0; i<size-1; i++){
            for(int k=i+1; k<size; k++){
                int a = (numlist[i] - n) * (numlist[i] > n ? 1 : -1);
                int b = (numlist[k] - n) * (numlist[k] > n ? 1 : -1);
                if(a > b || (a == b && numlist[i] < numlist[k])){
                    int temp = numlist[i];
                    numlist[i] = numlist[k];
                    numlist[k] = temp;
                }
            }
        }
        return numlist;
    }

	public static void main(String[] args) {
		int[] numlist = {1, 2, 3, 4, 5, 6};
		int n = 4;
		
		System.out.println(solution(numlist, n));
	}
	
}