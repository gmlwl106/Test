package test;

/* 특이한 정렬
정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
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