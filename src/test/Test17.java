package test;

import java.util.Arrays;

/* A�� B �����
���ڿ� before�� after�� �Ű������� �־��� ��, before�� ������ �ٲپ� after�� ���� �� ������ 1��, ���� �� ������ 0�� return �ϵ��� solution �Լ��� �ϼ��غ�����.
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