package collection.conditions;

import collection.ReadFile;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortByAlphabeticalOrder {
    public Set<String> getSortWords() throws FileNotFoundException {
        Scanner scanner = new ReadFile().readFile();
        Set<String> words = new TreeSet<>();
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            words.add(word);
        }
        return words;
    }
}
