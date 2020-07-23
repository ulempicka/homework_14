package countNumbers;

import java.util.List;

public class TestNum {
    public static void main(String[] args) {
        String fileName = "src\\countNumbers\\numbers.txt";
        List<Integer> numbers = NumReader.generateNumbers(fileName);
        NumStats.displayStats(numbers);
    }
}
