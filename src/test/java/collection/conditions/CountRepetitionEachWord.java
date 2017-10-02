package collection.conditions;

import collection.ReadFile;

import java.io.FileNotFoundException;
import java.util.*;

public class CountRepetitionEachWord {
    public Map<String, Integer> getRepeatEachWord() throws FileNotFoundException {
        Scanner scanner = new ReadFile().readFile();
        Map<String, Integer> statistics = new TreeMap<>();
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
        }
        return statistics;
    }
}
