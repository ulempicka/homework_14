package countNumbers;

import java.util.List;

public class NumStats {
    public static int numCount(List<Integer> numbers, int uniqueNum) {
        int count = 0;
        for (Integer number : numbers) {
            if (number == uniqueNum) {
                count++;
            }
        }
        return count;
    }
}
