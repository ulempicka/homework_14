package countNumbers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumReader {
    public static List<Integer> generateNumbers(String fileName) {
        List<Integer> numbers = new ArrayList<>();
        File file = new File(fileName);

        try (
                var scanner = new Scanner(file)
        ) {
            while (scanner.hasNextLine()) {
                Integer number = scanner.nextInt();
                numbers.add(number);
            }

        } catch (IOException e) {
            System.err.println("nie mozna odczytac pliku");
        }
        return numbers;
    }
}
