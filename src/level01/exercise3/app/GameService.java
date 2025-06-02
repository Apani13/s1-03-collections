package level01.exercise3.app;

import level01.exercise3.data.CountryLoader;

import java.io.IOException;
import java.util.*;

public class GameService {

    private final Map<String, String> countriesMap;
    private final Random random;

    public GameService() {
        Map<String, String> map = new HashMap<>();
        CountryLoader loader = new CountryLoader();

        try {
            List<String> lines = loader.readCountryFile();
            map = loader.populateCountriesMap(lines);
        } catch (IOException e) {
            System.err.println("ERROR: Could not load countries. Reason: " + e.getMessage());
        }

        this.countriesMap = map;
        this.random = new Random();
    }



    public List<String> selectRandomCountries(int count) {
        List<String> countries = new ArrayList<>(countriesMap.keySet());
        Collections.shuffle(countries, random);
        return countries.subList(0, Math.min(count, countries.size()));
    }


    public boolean isCorrectAnswer(String country, String userAnswer) {
        String correctCapital = countriesMap.get(country);
        return (correctCapital != null) && (userAnswer.equalsIgnoreCase(correctCapital));
    }


    public String getCapital(String country) {
        return countriesMap.get(country);
    }
}
