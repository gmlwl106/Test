package test;

/* 잘라서 배열로 저장하기
문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
 */

public class Test24 {
	public static String[] solution(String my_str, int n) {
		int length = (int) Math.ceil((double)my_str.length()/n); //double형으로 변환 후 올림을 해야함
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