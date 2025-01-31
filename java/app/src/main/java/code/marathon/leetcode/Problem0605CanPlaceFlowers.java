package code.marathon.leetcode;

/**
 * <a href="https://leetcode.com/problems/can-place-flowers/">605. Can Place Flowers</a>
 */
public class Problem0605CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length && n > 0; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == (flowerbed.length - 1) || flowerbed[i + 1] == 0)) {
                n--;
                flowerbed[i] = 1;
            }
        }

        return (n == 0);
    }
}
