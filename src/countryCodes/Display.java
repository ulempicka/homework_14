package countryCodes;

import java.util.Map;

public class Display {
    public static void showStats(String countryCode, Map<String, Country> countries) {

        if(!countries.containsKey(countryCode)){
            System.out.println("Niepoprawny kod kraju!");
            return;
        }
        Country country = countries.get(countryCode);
        System.out.println(country.getName() + " (" + country.getCode() + ") ma " + country.getPopulation() + " ludności.");
    }
}
