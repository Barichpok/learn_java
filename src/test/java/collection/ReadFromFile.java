package collection;

import java.io.FileNotFoundException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ReadFromFile {
    public Set<String> getWords() throws FileNotFoundException {
        Scanner scanner = new ReadFile().readFile();
        Set<String> words = new LinkedHashSet<>();
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            words.add(word);
        }
        return words;
    }
}
