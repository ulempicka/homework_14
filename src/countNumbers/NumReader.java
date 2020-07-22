package countNumbers;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class NumReader {
    public static List<Integer> generateNumbers(String fileName) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        File file = new File(fileName);

        try (
                var scanner = new Scanner(file)
        ) {
            while (scanner.hasNextLine()) {
                Integer number = scanner.nextInt();
                numbers.add(number);
            }

        }
        return numbers;
    }
}
