package test;

/* 7의 개수
머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
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