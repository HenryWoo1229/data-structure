import java.util.Objects;

/**
 * Created by candy on 2019/12/30.
 */
public class Array {

    /**
     * 给定一个字符串，翻转之
     * 双头指针，交换所指元素的位置，直到指针相遇
     */
    public static String reverseString(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        char[] sChars = s.toCharArray();
        int j = sChars.length - 1;
        for (int i = 0; i != j; i++) {
            char temp = sChars[i];
            sChars[i] = sChars[j];
            sChars[j] = temp;
            j--;
        }
        return new String(sChars);
    }

    /**
     * LeetCode 第 242 题：给定两个字符串 s 和 t，编写一个函数来判断 t 是否是 s 的字母异位词。
     * 取一个装有26个小写字母的 char 数组，和一个有26个元素的 int 数组，将 s 的字符在字母表数组中查找
     * 并在 int 数组中记录对应位置的数量，在 t 的 char 数组中减掉对应位置的数量，最后判断 int 数组各项是否为 0
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagrams(String s, String t) {
        if (Objects.equals(s, t)) {
            return false;
        }

        int[] location = new int[26];
        char[] letters = new char[26];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) ('a' + i);
        }

        char[] sChar = s.toCharArray();
        for (int i = 0; i < sChar.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                if (sChar[i] == letters[j]) {
                    location[j]++;
                    break;
                }
            }
        }

        char[] tChar = t.toCharArray();
        for (int i = 0; i < tChar.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                if (tChar[i] == letters[j]) {
                    location[j]--;
                    break;
                }
            }
        }

        for (Integer i : location) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
