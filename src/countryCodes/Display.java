package countryCodes;

import java.util.Map;

public class Display {
    public static void showStats(String countryCode, Map<String, Country> countries) {
        for (String key : countries.keySet()) {
            if (key.equals(countryCode)) {
                Country country = countries.get(key);
                System.out.println(country.getName() + " (" + country.getCode() + ") ma " + country.getPopulation() + " ludności.");
            }
            else if(!countries.containsKey(countryCode)){
                System.out.println("Niepoprawny kod kraju!");
                break;
            }
        }
    }
}
