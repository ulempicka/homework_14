package countryCodes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountryReader {
    public static Map<String, Country> generateCountries(String fileName) {
        Map<String, Country> countries = new HashMap<>();

        try (
                var fileReader = new FileReader(fileName);
                var reader = new BufferedReader(fileReader)
        ) {
            int i = 0;
            String nextLine = "";
            while ((nextLine = reader.readLine()) != null) {
                String[] split = nextLine.split(";");
                countries.put(split[0], new Country(split[0], split[1], Integer.parseInt(split[2])));
                i++;
            }
        } catch (IOException e) {
            System.err.println("nie mozna odczytac pliku");
        }
        return countries;
    }
}
