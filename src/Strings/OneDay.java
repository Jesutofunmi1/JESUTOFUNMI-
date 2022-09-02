package Strings;
public class OneDay {
    public static void main(String[] args) {

        String s = "abcdabcdabcda";
        char[] charArray = s.toCharArray();
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a') {
            count++;
            }
        }
        return ;
    }
}
