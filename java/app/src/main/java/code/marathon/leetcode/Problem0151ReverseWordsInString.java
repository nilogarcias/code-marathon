package code.marathon.leetcode;

import java.util.StringTokenizer;

public class Problem0151ReverseWordsInString {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        StringTokenizer st = new StringTokenizer(s, " ");
        sb.append(st.nextToken());
        while (st.hasMoreTokens()) {
            sb.insert(0, ' ');
            sb.insert(0, st.nextToken());
        }

        return sb.toString();
    }
}
