package level01.exercise3.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryLoader {

    public List<String> readCountryFile() throws IOException {
        List<String> lines = new ArrayList<>();

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("level01/exercise3/resources/countries.txt");

        if (inputStream == null) {
            throw new IOException("File countries.txt not found");
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            System.err.println("READING FILE ERROR: " + e.getMessage());
        }

        return lines;
    }


    public Map<String, String> populateCountriesMap(List<String> lines) {

        Map<String, String> countriesMap = new HashMap<>();

        for (String line : lines) {
            int spaceIndex = line.indexOf(" ");

            if (spaceIndex != -1) {
                String country = line.substring(0, spaceIndex).trim();
                String capital = line.substring(spaceIndex + 1).trim();

                if (!country.isEmpty() && !capital.isEmpty()) {
                        countriesMap.put(country, capital);
                } else {
                    System.err.println("FORMAT ERROR (empty data): " + line);
                }
            } else {
                    System.err.println("FORMAT ERROR (no space separator): " + line);
            }
        }

        return countriesMap;
    }

}

