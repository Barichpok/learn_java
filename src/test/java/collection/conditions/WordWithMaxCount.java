package collection.conditions;

import java.io.FileNotFoundException;
import java.util.*;

public class WordWithMaxCount {
    public String getWordWithMaxCount() throws FileNotFoundException {
        Map<String, Integer> statistics = new CountRepetitionEachWord().getRepeatEachWord();

        Collection<Integer> values = statistics.values();
        Integer max = Collections.max(values);
        Set<String> result = new TreeSet<>();
        for (Map.Entry<String, Integer> entry : statistics.entrySet()) {
            if (max != 1 && max.equals(entry.getValue())) {
                result.add(entry.getKey());
            }
        }

        if (result.size() == 0) {
            System.out.print("Повторений нет - ");
        }

        String resultWithNumber = null;
        for (String key : result) {
            resultWithNumber = key + ": " + Collections.max(values);
        }
        return resultWithNumber;
    }
}
