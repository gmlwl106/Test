package test;

import java.util.Arrays;

/* A로 B 만들기
문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
 */

public class Test17 {
	public static int solution(String before, String after) {
//        List<String> beList = Arrays.asList(before.split(""));
//        List<String> afList = Arrays.asList(after.split(""));
//        Collections.sort(beList);
//        Collections.sort(afList);
//        
//        for(int i=0; i<beList.size(); i++) {
//        	if(!beList.get(i).equals(afList.get(i))) {
//        		return 0;
//        	}
//        }
//        return 1;
		
		char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b)) ? 1 :0;
    }

	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello";
		System.out.println(solution(before, after));
	}
	
}