/*
 * ����һ����������Сд��ĸ�Ϳո� ' ' ���ַ��������������һ�����ʵĳ��ȡ�

������������һ�����ʣ��뷵�� 0 ��

˵����һ��������ָ����ĸ��ɣ����������κοո���ַ�����

ʾ��:

����: "Hello World"
���: 5
*/
package lianxi0305;

public class test0305 {
	public static void main(String[] args) {
	Solution S = new Solution();
	String s = "asdsa fffa";
	int a = S.lengthOfLastWord(s);
	System.out.println(a);
	}

}

class Solution {
    public int lengthOfLastWord(String s) {
    	int end = s.length() - 1;
        int count = 0;
        while (end >= 0){
            char c = s.charAt(end);
            if((c >= 'a' && c <= 'z') || c >= 'A' && c <= 'Z'){
                count++;
            } else {
                if(count != 0){
                    break;
                }
            }
            end--;
        }
        return count;
    }
}