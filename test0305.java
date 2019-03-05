/*
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。

如果不存在最后一个单词，请返回 0 。

说明：一个单词是指由字母组成，但不包含任何空格的字符串。

示例:

输入: "Hello World"
输出: 5
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