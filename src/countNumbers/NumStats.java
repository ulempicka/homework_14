package countNumbers;

import java.util.List;
import java.util.TreeSet;

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

    public static void displayStats(List<Integer> numbers) {

        TreeSet<Integer> uniqueNum = new TreeSet<>(numbers);
        System.out.println("Liczba cyfr w pliku: " + numbers.size());
        System.out.println("Liczba unikalnych cyfr w pliku: " + uniqueNum.size());

        for (Integer num : uniqueNum) {
            System.out.println(num + " – liczba wystąpień: " + numCount(numbers, num));
        }
    }
}
