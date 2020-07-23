package countryCodes;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestCountry {
    public static void main(String[] args) {
        String fileName = "src\\countryCodes\\country.csv";
        Map<String, Country> countries = new HashMap<>();

        try {
            countries = CountryReader.generateCountries(fileName);
        } catch (IOException e) {
            System.err.println("nie mozna odczytac pliku");
        }
        System.out.println("Kody dostępnych krajów " + countries.keySet());
        System.out.println("Liczba krajów " + countries.size());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje:");
        String countryCode = scanner.nextLine();
        Display.showStats(countryCode, countries);
    }
}
