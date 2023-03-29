package test;

/* 종이 자르기
머쓱이는 큰 종이를 1 x 1 크기로 자르려고 합니다. 예를 들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세 번이 필요합니다.
 */

public class Test27 {
	public static int solution(int M, int N) {
        return (M*N)-1;
        //(가로-1)*(세로-1)
    }

	public static void main(String[] args) {
		int M = 2;
		int N = 5;
		System.out.println(solution(M,N));
	}
	
}