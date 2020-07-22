package countNumbers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TestNum {
    public static void main(String[] args) {
        String fileName = "src\\countNumbers\\numbers.txt";
        List<Integer> numbers = new ArrayList<>();
        try {
            numbers = NumReader.generateNumbers(fileName);
        } catch (IOException e) {
            System.err.println("nie mozna odczytac pliku");
        }

        TreeSet<Integer> uniqueNum = new TreeSet<>(numbers);
        System.out.println("Liczba cyfr w pliku: " + numbers.size());
        System.out.println("Liczba unikalnych cyfr w pliku: " + uniqueNum.size());

        for (Integer num : uniqueNum) {
            System.out.println(num + " – liczba wystąpień: " + NumStats.numCount(numbers,num));
        }
    }
}
