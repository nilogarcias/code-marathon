package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/string-compression/description/">LeetCode: String Compression</a>
 * [ Time taken: 22 m 6 s ]
 * O(n) time
 */
public class Problem443StringCompression {

    private int writeGroupLen(char[] chars, int resultIdx, char currentChar, int groupLen) {
        chars[resultIdx] = currentChar;
        if (groupLen > 1) {
            String groupLenStr = String.valueOf(groupLen);
            for (char digit : groupLenStr.toCharArray()) {
                chars[++resultIdx] = digit;
            }
        }
        return resultIdx;
    }

    public int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }

        int resultIdx = 0;
        int groupLen = 1;
        char currentChar = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == currentChar) {
                groupLen++;
            } else {
                resultIdx = writeGroupLen(chars, resultIdx, currentChar, groupLen) + 1;
                currentChar = chars[i];
                groupLen = 1;
            }
        }

        return writeGroupLen(chars, resultIdx, currentChar, groupLen) + 1;
    }
}
