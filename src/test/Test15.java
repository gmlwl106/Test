package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* ���ڿ� �����ϱ�(2)
���� ��ҹ��ڷ� �̷���� ���ڿ� my_string�� �Ű������� �־��� ��, my_string�� ��� �ҹ��ڷ� �ٲٰ� ���ĺ� ������� ������ ���ڿ��� return �ϵ��� solution �Լ��� �ϼ��غ�����.
 */

public class Test15 {
	public static String solution(String my_string) {
        String answer = "";
        List<String> arr = Arrays.asList(my_string.toLowerCase().split(""));
        Collections.sort(arr);
        
        for(String str : arr) {
        	answer += str;
        }
        return answer;
    }

	public static void main(String[] args) {
		String my_string = "Bcad";
		System.out.println(solution(my_string));
	}
	
}