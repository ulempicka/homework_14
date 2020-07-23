package countryCodes;

import java.util.Map;
import java.util.Scanner;

public class TestCountry {
    public static void main(String[] args) {
        String fileName = "src\\countryCodes\\country.csv";
        Map<String, Country> countries = CountryReader.generateCountries(fileName);
        System.out.println("Kody dostępnych krajów " + countries.keySet());
        System.out.println("Liczba krajów " + countries.size());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje:");
        String countryCode = scanner.nextLine();
        Display.showStats(countryCode, countries);
    }
}
